/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.Dao;

import com.swcguild.contentmanagmentsystems.dto.Post;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */
public class PostDbImpl implements PostDao {

    private JdbcTemplate jdbcTemplate;

    private static final String SQL_PUBLISH_POST = "update post set approved=? where post_id=?";

    private static final String SQL_UPDATE_CATEGORIES = "update category set category_description=? where category_id=?";
    private static final String SQL_UPDATE_Tags = "update tag set tag_description=? where tag_id=?";

    private static final String SQL_DELETE_TAG = "delete from tag where tag_id=?";
    private static final String SQL_DELETE_TAG_POST = "delete from post_tag where tag_id=?";

    private static final String SQL_DELETE_POST = "delete from post where post_id =?";
    private static final String SQL_DELETE_CATEGORY_POST = "delete from category_post where post_id=?";
    private static final String SQL_DELETE_POST_TAG = "delete from post_tag where post_id=?";

    private static final String SQL_DELETE_FROM_POST_CATEGORY = "delete from category_post where category_id =?";
    private static final String SQL_DELETE_FROM_CATEGORY = "delete from category where category_id=? ";

    private static final String SQL_SELECT_POST_BY_Category = "select * from post p "
            + "join category_post cp on p.post_id = cp.post_id "
            + "join category cat on cp.category_id = cat.category_id where cat.category_description =?";

    private static final String SQL_SELECT_POST_BY_TAG = "select * from post p "
            + "join post_tag pt on p.post_id = pt.post_id "
            + "join tag t on pt.tag_id = t.tag_id where t.tag_description =?";

    private static final String SQL_INSERT_POST = "insert into post(user_id,content,title,date) values(?,?,?,?)";

    public static final String SQL_UPDATE_POST = "update post set title=?, content=? where post_id=?";

    private static final String SQL_SELECT_POST = "select * from post where post_id =?";

    private static final String SQL_LIST_POST_BY_DATE = "select * from post order by date desc limit ?";
    
    private static final String SQL_LIST_POST_BY_DATE_AND_APPROVED = "select * from post where approved = true  order by date desc limit ?";

//    categories
    private static final String SQL_INSERT_CATEGORY_POST = "insert into category_post(category_id,post_id) values(?,?)";

    private static final String SQL_SELECT_CATEGORY_BY_POST_ID = "select cat.category_description from category cat "
            + "join category_post cp on cat.category_id = cp.category_id where cp.post_id =?";

    private static final String SQL_SELECT_CATEGORIES = "select * from category";
    private static final String SQL_SELECT_TAG = "select * from tag";

    private static final String SQL_INSERT_CATEGORY = "insert into category(category_description) values(?)";

//    TAGS
    private static final String SQL_INSERT_TAG = "insert into tag(tag_description) values(?)";

    private static final String SQL_SELECT_TAG_BY_POST = "select tag.tag_description from tag "
            + "join post_tag pt on tag.tag_id = pt.tag_id where pt.post_id =?";

    private static final String SQL_SELECT_TAG_ID_BY_DESCRIPTION = "select tag_id from tag where tag_description=?";

    private static final String SQL_INSERT_POST_TAG = "insert into post_tag(post_id,tag_id) values(?,?)";

    private static final String SQL_SELECT_MOST_OCCURENCE_CATEGORIES = "select * from category "
            + "join category_post cp on category.category_id = cp.category_id group by cp.category_id order by count(cp.category_id) desc limit 5";

    private static final String SQL_SELECT_MOST_OCCURENCE_TAGS = "select * from tag "
            + "join post_tag pt on tag.tag_id = pt.tag_id group by pt.tag_id order by count(pt.tag_id) desc limit 5";

    public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Map<Integer, String> getCategoriesByOccurence() {
        List<Pair> list = jdbcTemplate.query(SQL_SELECT_MOST_OCCURENCE_CATEGORIES, new CategoryPairMapper());

        Map<Integer, String> map = new HashMap<>();

        for (Pair pair : list) {
            map.put(pair.num, pair.str);
        }

        return map;
    }

    @Override
    public Map<Integer, String> getTagByOccurence() {
        List<Pair> list = jdbcTemplate.query(SQL_SELECT_MOST_OCCURENCE_TAGS, new TagPairMapper());

        Map<Integer, String> map = new HashMap<>();

        for (Pair pair : list) {
            map.put(pair.num, pair.str);
        }

        return map;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Post addPost(Post post) {
        jdbcTemplate.update(SQL_INSERT_POST, post.getUserId(), post.getBody(), post.getTitle(), post.getDate());
        post.setPostId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));

        return post;
    }

    @Override
    public Post addPost(Post post, List<String> categoryIds) {
        jdbcTemplate.update(SQL_INSERT_POST, post.getUserId(), post.getBody(), post.getTitle(), post.getDate());
        post.setPostId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));

        for (String id : categoryIds) {
            jdbcTemplate.update(SQL_INSERT_CATEGORY_POST, id, post.getPostId());
        }

        return post;
    }

    @Override
    public Post getPost(int postId) {
        Post post = jdbcTemplate.queryForObject(SQL_SELECT_POST, new PostMapper(), postId);

        post.setCategors(getCategories(post));
        post.setTags(getTagsForPost(post));
        return post;
    }

    @Override
    public List<String> getCategories(Post post) {
        return jdbcTemplate.queryForList(SQL_SELECT_CATEGORY_BY_POST_ID, String.class, post.getPostId());
    }

    @Override
    public Map<Integer, String> getCategoriesWithIndex() {

        List<Pair> list = new ArrayList<>();
        list = jdbcTemplate.query(SQL_SELECT_CATEGORIES, new CategoryPairMapper());

        Map<Integer, String> map = new HashMap<>();

        for (Pair pair : list) {
            map.put(pair.num, pair.str);
        }

        return map;
    }

    @Override
    public Map<Integer, String> getTagWithindex() {
        List<Pair> list = new ArrayList<>();
        list = jdbcTemplate.query(SQL_SELECT_TAG, new TagPairMapper());

        Map<Integer, String> map = new HashMap<>();

        for (Pair pair : list) {
            map.put(pair.num, pair.str);
        }

        return map;
    }

    @Override
    public void addCategory(String str) {
        try {
            jdbcTemplate.update(SQL_INSERT_CATEGORY, str);
        } catch (Exception e) {

        }

    }

    @Override
    public void addTag(List<String> list, Post post) {
        for (String str : list) {
            try {
                jdbcTemplate.update(SQL_INSERT_TAG, str);
            } catch (Exception e) {
            }

            Integer id = jdbcTemplate.queryForObject(SQL_SELECT_TAG_ID_BY_DESCRIPTION, Integer.class, str);
            jdbcTemplate.update(SQL_INSERT_POST_TAG, post.getPostId(), id);

        }
    }

    @Override
    public List<String> getPosts(Post post) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getTagsForPost(Post post) {
        return jdbcTemplate.queryForList(SQL_SELECT_TAG_BY_POST, String.class, post.getPostId());
    }

    @Override
    public void deletePost(int id) {
        jdbcTemplate.update(SQL_DELETE_CATEGORY_POST, id);
        jdbcTemplate.update(SQL_DELETE_POST_TAG, id);
        jdbcTemplate.update(SQL_DELETE_POST, id);
    }

    @Override
    public void updatePost(Post post) {
        jdbcTemplate.update(SQL_UPDATE_POST, post.getTitle(), post.getBody(), post.getPostId());
    }

    @Override
    public void updateTagsCategories(Post post) {
        jdbcTemplate.update(SQL_DELETE_CATEGORY_POST, post.getPostId());
        jdbcTemplate.update(SQL_DELETE_POST_TAG, post.getPostId());

        for (String id : post.getCategors()) {
            jdbcTemplate.update(SQL_INSERT_CATEGORY_POST, id, post.getPostId());
        }

        addTag(post.getTags(), post);

    }

    @Override
    public List<Post> getPostsByLastDates(int num) {
        List<Post> list = jdbcTemplate.query(SQL_LIST_POST_BY_DATE_AND_APPROVED, new PostMapper(), num);

        for (Post post : list) {
            post.setCategors(getCategories(post));
            post.setTags(getTagsForPost(post));
        }
        return list;
    }
    @Override
    public List<Post> getPosts(int num) {
        List<Post> list = jdbcTemplate.query(SQL_LIST_POST_BY_DATE, new PostMapper(), num);

        for (Post post : list) {
            post.setCategors(getCategories(post));
            post.setTags(getTagsForPost(post));
        }
        return list;
    }

    @Override
    public List<Post> getPostByCategories(String category) {
        List<Post> list = jdbcTemplate.query(SQL_SELECT_POST_BY_Category, new PostMapper(), category);

        for (Post post : list) {
            post.setCategors(getCategories(post));
            post.setTags(getTagsForPost(post));
        }
        return list;
    }

    @Override
    public List<Post> getPostByTag(String tag) {
        List<Post> list = jdbcTemplate.query(SQL_SELECT_POST_BY_TAG, new PostMapper(), tag);

        for (Post post : list) {
            post.setCategors(getCategories(post));
            post.setTags(getTagsForPost(post));
        }
        return list;
    }

    @Override
    public void updateCategory(int id, String value) {
        jdbcTemplate.update(SQL_UPDATE_CATEGORIES, value, id);
    }

    @Override
    public void updateTags(int id, String value) {
        jdbcTemplate.update(SQL_UPDATE_Tags, value, id);
    }

    @Override
    public void deleteCategory(int id) {
        jdbcTemplate.update(SQL_DELETE_FROM_POST_CATEGORY, id);
        jdbcTemplate.update(SQL_DELETE_FROM_CATEGORY, id);

    }

    @Override
    public void deleteTag(int id) {
        jdbcTemplate.update(SQL_DELETE_TAG_POST, id);
        jdbcTemplate.update(SQL_DELETE_TAG, id);

    }

    @Override
    public void publishPost(int id) {
        jdbcTemplate.update(SQL_PUBLISH_POST, true, id);
    }

    @Override
    public void unpublishPost(int id) {
        jdbcTemplate.update(SQL_PUBLISH_POST, false, id);
    }

    private static class PostMapper implements ParameterizedRowMapper<Post> {

        @Override
        public Post mapRow(ResultSet rs, int i) throws SQLException {
            Post post = new Post();
            post.setPostId(rs.getInt("post_id"));
            post.setTitle(rs.getString("title"));
            post.setUserId(rs.getInt("user_id"));
            post.setBody(rs.getString("content"));
            post.setDate(rs.getDate("date"));
            post.setApproved(rs.getBoolean("approved"));

            return post;
        }

    }

    private static class CategoryPairMapper implements ParameterizedRowMapper<Pair> {

        @Override
        public Pair mapRow(ResultSet rs, int i) throws SQLException {
            Pair pair = new Pair();

            pair.str = rs.getString("category_description");
            pair.num = rs.getInt("category_id");

            return pair;
        }
    }

    private static class TagPairMapper implements ParameterizedRowMapper<Pair> {

        @Override
        public Pair mapRow(ResultSet rs, int i) throws SQLException {
            Pair pair = new Pair();
            pair.str = rs.getString("tag_description");
            pair.num = rs.getInt("tag_id");
            return pair;
        }
    }

    private static class Pair {

        String str;
        Integer num;
    }

}
