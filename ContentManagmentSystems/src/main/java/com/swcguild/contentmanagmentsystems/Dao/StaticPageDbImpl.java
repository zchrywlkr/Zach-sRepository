/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.Dao;

import com.swcguild.contentmanagmentsystems.dto.StaticPage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

/**
 *
 * @author apprentice
 */
public class StaticPageDbImpl implements StaticPageDao {
    
    private JdbcTemplate jdbcTemplate;
    
    private static final String SQL_INSERT_STATICPAGE ="insert into static_page(static_page_title,static_page_content,order_number) values(?,?,?)";
    
    private static final String SQL_UPDATE_STATICPAGE="update static_page set static_page_title=?,static_page_content=?,order_number=? where static_page_id=?";
    
    private  static final String SQL_SELECT_STATICPAGE="select * from static_page where static_page_id=?";
    
    private static final String SQL_SELECT_ALL_STATICPAGE ="select * from static_page ";
    
    private static final String SQL_SELECT_ALL_IN_ORDER ="select * from static_page order by order_number asc";
    
    private static final String SQL_SELECT_STATICPAGE_BY_INDEX="select * from static_page where order_number=?";
    
    private static final String SQL_DELETE_PAGE ="delete from static_page where static_page_id=?";
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    
    @Override
    public StaticPage getPage(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_STATICPAGE, new pageMapper(),id);
    }

    @Override
    public void addPage(StaticPage page) {
        jdbcTemplate.update(SQL_INSERT_STATICPAGE,page.getTitle(),page.getBody(),page.getIndex());
    }

    @Override
    public void editPage(StaticPage page) {
        jdbcTemplate.update(SQL_UPDATE_STATICPAGE,page.getTitle(),page.getBody(),page.getIndex(),page.getId());
    }

    @Override
    public StaticPage setIndex(StaticPage page,int index) {
        
        
        StaticPage page1 =  selectPageByIndex(index);
        page1.setIndex(page.getIndex());
        updatePage(page1);
        page.setIndex(index);
        updatePage(page);
        
        return page;
    }

    @Override
    public List<StaticPage> getAllStaticPage() {
        return jdbcTemplate.query(SQL_SELECT_ALL_IN_ORDER, new pageMapper());
    }

    @Override
    public void updatePage(StaticPage page) {
        jdbcTemplate.update(SQL_UPDATE_STATICPAGE,page.getTitle(),page.getBody(),page.getIndex(),page.getId());
    }

    @Override
    public StaticPage selectPageByIndex(int index) {
        return jdbcTemplate.queryForObject(SQL_SELECT_STATICPAGE_BY_INDEX, new pageMapper(),index);
    }

    @Override
    public void deletePage(int id) {
        
        List<StaticPage> list = getAllStaticPage();
      
        int index  = getPage(id).getIndex();
        jdbcTemplate.update(SQL_DELETE_PAGE,id);
        for(int i=index;i<list.size();i++){
            StaticPage p = list.get(i);
            p.setIndex(p.getIndex()-1);
            updatePage(p);
        }
        
    }
    
    
    private static class pageMapper implements ParameterizedRowMapper<StaticPage>{

        @Override
        public StaticPage mapRow(ResultSet rs, int i) throws SQLException {
            StaticPage page = new StaticPage();
            page.setTitle(rs.getString("static_page_title"));
            page.setBody(rs.getString("static_page_content"));
            page.setId(rs.getInt("static_page_id"));
            page.setIndex(rs.getInt("order_number"));
            
            return page;
        }
        
    }
}
