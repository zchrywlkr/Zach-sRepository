/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.redbox.dao;

import com.swcguild.redbox.dto.Dvd;
import com.swcguild.redbox.dto.Order;
import com.swcguild.redbox.dto.User;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class RedBoxDaoDbImpl implements RedBoxDao
{

    private JdbcTemplate jdbcTemplate;

    //dvd
    private static final String SQL_INSERT_DVD = "insert into dvd (rating,cover,trailer,notes,title,releaseDate,director,studio,mpaa) values(?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE_DVD = "delete from dvd where id =?";
    private static final String SQL_SELECT_DVD = "select * from dvd where id = ?";
    private static final String SQL_SELECT_ALL_DVD = "select * from dvd";
    private static final String SQL_UPDATE_DVD = "update dvd set rating =?,cover=?,trailer = ?,notes = ?, title = ?, releaseDate = ?, director = ?, studio = ?, mpaa = ? where id=?";

    private static final String SQL_INSERT_DVD_GENRE = "insert into genre_dvd(genre_id,dvd_id) values(?,?)";

    private static final String SQL_SELECT_DVD_GENRE_GENRE_DVD_BY_GENRE_ID = "select genre_id from genre_dvd where dvd_id =?";

    //user
    private static final String SQL_SELECT_BY_CARD = "select * from user where credit_card =?";
    private static final String SQL_INSERT_USER = "insert into user (first_name,last_name,credit_card,street,city,state,zip) values(?,?,?,?,?,?,?)";
    private static final String SQL_DELETE_USER = "delete from user where user_id =?";
    private static final String SQL_SELECT_USESR = "select * from user where user_id = ?";
    private static final String SQL_SELECT_ALL_USER = "select * from user";
    private static final String SQL_UPDATE_USER = "update user set first_name =?,last_name=?,credit_card= ?,street= ?, city= ?, state= ?, zip= ? where user_id = ?";

    //order
    private static final String SQL_INSERT_ORDERS = "insert into orders (inventory_id,start_date,end_date,price,user_id) values(?,?,?,?,?)";
    private static final String SQL_DELETE_ORDERS = "delete from orders where orders where order_id =?";
    private static final String SQL_SELECT_ORDERS_BY_USER = "select * from orders where user_id = ?";
    private static final String SQL_SELECT_ALL_ORDERS = "select * from orders";
    private static final String SQL_SELECT_ORDER ="select * from orders where order_id = ?";;
    private static final String SQL_UPDATE_ORDERS = "update orders set inventory_id =?,start_date=?,end_date= ?,price= ?, user_id= ? where order_id=?";

    //genres
    private static final String SQL_SELECT_GENRE = "select genre from genres where genre_id =?";
    
    //inventory
    private static final String SQL_INSERT_INVENTORY ="insert into inventory(dvd_id,rented) values(?,?)";
    private static final String SQL_UPDATE_INVENTORY ="update inventory set rented=? where inventory_id =?";
    private static final String SQL_FIND_INVENTORY = "select inventory_id from inventory where dvd_id=? and rented=? limit 1";
    

    public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    //--------------------------------USER----------------------------------------------
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addUser(User user) {
        jdbcTemplate.update(SQL_INSERT_USER, user.getFirstName(),
                user.getLastName(), user.getCreditCard(),
                user.getStreet(), user.getCity(), user.getState(), user.getZip());
        user.setId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));

    }

    @Override
    public User getUserById(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_USESR,new UserMapper(),id);
    }

    @Override
    public void remove(int id) {
        jdbcTemplate.update(SQL_DELETE_USER,id);
    }

    @Override
    public List<Integer> getHistory(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> listAllUsers() {
        return jdbcTemplate.query(SQL_SELECT_ALL_USER,new UserMapper());
    }
    
       @Override
    public User getByCreditCard(String card) {
        return jdbcTemplate.queryForObject(SQL_SELECT_BY_CARD,new UserMapper(),card);
    }

    
    // ------------------------------------dvds----------------------------------------------------------
    @Override
    public List getAllMovies() {
        return jdbcTemplate.query(SQL_SELECT_ALL_DVD, new DvdMapper());
    }

    @Override
    public Dvd getMovie(int id) {
        Dvd dvd;
        try {
            dvd = jdbcTemplate.queryForObject(SQL_SELECT_DVD, new DvdMapper(), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
        dvd.setGenres(getGenresByDvdId(dvd));
        return dvd;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addMovie(Dvd dvd) {
        jdbcTemplate.update(SQL_INSERT_DVD, dvd.getRating(), dvd.getCover(), dvd.getTrailer(),
                dvd.getNotes(), dvd.getTitle(), dvd.getRelease(),
                dvd.getDirector(), dvd.getStudio(), dvd.getMpaa());
        dvd.setId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));

        for (int genreId : dvd.getGenres()) {
            jdbcTemplate.update(SQL_INSERT_DVD_GENRE, genreId, dvd.getId());
        }
        
      
        
    }

    @Override
    public int getInventory(int id) {
        int inventoryId;
        try{
            inventoryId= jdbcTemplate.queryForObject(SQL_FIND_INVENTORY, Integer.class,id,0);
        }catch(Exception e){
            return -1;
        }
        jdbcTemplate.update(SQL_UPDATE_INVENTORY,1,inventoryId);
        return inventoryId;
    }

    @Override
    public void setInventory(Dvd dvd) {
          for(int i=0; i <dvd.getInventory();i++){
            jdbcTemplate.update(SQL_INSERT_INVENTORY,dvd.getId(),0);
        }
    }

    @Override
    public List<Integer> getGenresByDvdId(Dvd dvd) {
        List<Integer> genres = jdbcTemplate.queryForList(SQL_SELECT_DVD_GENRE_GENRE_DVD_BY_GENRE_ID, new Integer[]{dvd.getId()}, Integer.class);

        return genres;
    }

    @Override
    public List<String> getGenres(List<Integer> genreIds) {
        List<String> genres = new ArrayList<>();
        for (int i : genreIds) {
            genres.add(jdbcTemplate.queryForObject(SQL_SELECT_GENRE, String.class, i));
        }
        return genres;
    }

    @Override
    public void deleteDvd(int id) {
        jdbcTemplate.update(SQL_DELETE_DVD, id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void editMovie(Dvd dvd) {
        jdbcTemplate.update(SQL_UPDATE_DVD, dvd.getRating(),
                dvd.getCover(), dvd.getTrailer(), dvd.getNotes(),
                dvd.getTitle(), dvd.getRelease(), dvd.getDirector(),
                dvd.getStudio(), dvd.getMpaa(), dvd.getId());
    }
    
    
//    --------------------------Order-------------------------------------------

    @Override
    public List<Order> listAllOrders() {
        return jdbcTemplate.query(SQL_SELECT_ALL_ORDERS, new OrderMapper());
    }

    @Override
    public List<Order> getOrdersByUser(int id) {
        return jdbcTemplate.query(SQL_SELECT_ORDERS_BY_USER,new OrderMapper(),id);
        
        
    }

    @Override
    public void addOrder(Order order) {
        jdbcTemplate.update(SQL_INSERT_ORDERS,order.getInventoryId(),
                order.getStart(),order.getEnd(),order.getPrice(),order.getUserId());
        order.setId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));
    }

    @Override
    public void removeOrder(int id) {
        jdbcTemplate.update(SQL_DELETE_ORDERS,id);
    }

    @Override
    public Order setTotal(int id, String end) {
        Order order = getOrder(id);
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String str = sdf.format(date);
        order.setEnd(str);
        Date date2;
        long diffDay=0;
        try {
            date2 = sdf.parse(order.getStart());
            diffDay = date.getDay() - date2.getDay();
        } catch (ParseException ex) {
            Logger.getLogger(RedBoxDaoDbImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        double price = diffDay*.25;
        order.setPrice(price);
        return order;
    }

    @Override
    public Order makeOrder(int inventoryId, int userId) {
        Order order = new Order();
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String str = sdf.format(date);
        order.setStart(str);
        order.setPrice(1);
        order.setInventoryId(inventoryId);
        order.setEnd("");
        order.setUserId(userId);
        return order;
    }

    @Override
    public Order getOrder(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_ORDER, new OrderMapper(),id);
    }

    @Override
    public void updateOrder(Order order) {
        jdbcTemplate.update(SQL_UPDATE_ORDERS, 
                order.getInventoryId(),order.getStart(),order.getEnd(),
                order.getPrice(),order.getUserId(),order.getId());
//     "update orders set inventory_id =?,start_date=?,end_date= ?,price= ?, user_id= ? where order_id=?"
    }
    
    private static final class DvdMapper implements ParameterizedRowMapper<Dvd> {

        @Override
        public Dvd mapRow(ResultSet rs, int i) throws SQLException {
            Dvd dvd = new Dvd();
            dvd.setId(rs.getInt("id"));
            dvd.setDirector(rs.getString("director"));
            dvd.setMpaa(rs.getString("mpaa"));
            dvd.setNotes(rs.getString("notes"));
            dvd.setRating(rs.getInt("rating"));
            dvd.setRelease(rs.getString("releaseDate"));
            dvd.setStudio(rs.getString("studio"));
            dvd.setTitle(rs.getString("title"));
            dvd.setTrailer(rs.getString("trailer"));
            dvd.setCover(rs.getString("cover"));
            return dvd;
        }

    }

    private static final class UserMapper implements ParameterizedRowMapper<User>{

        @Override
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User user = new User();
            user.setFirstName(rs.getString("first_name"));
            user.setLastName(rs.getString("last_name"));
            user.setStreet(rs.getString("street"));
            user.setCity(rs.getString("city"));
            user.setState(rs.getString("state"));
            user.setZip(rs.getString("zip"));
            user.setCreditCard(rs.getString("credit_card"));
            user.setId(rs.getInt("user_id"));
            return user;
        }
        
    }
    
    private static class OrderMapper implements ParameterizedRowMapper<Order>{

        @Override
        public Order mapRow(ResultSet rs, int i) throws SQLException {
            Order order = new Order();
            order.setStart(rs.getString("start_date"));
            order.setInventoryId(rs.getInt("inventory_id"));
            order.setEnd(rs.getString("end_date"));
            order.setPrice(rs.getDouble("price"));
            order.setUserId(rs.getInt("user_id"));
            return order;
        }
        
    }
}
