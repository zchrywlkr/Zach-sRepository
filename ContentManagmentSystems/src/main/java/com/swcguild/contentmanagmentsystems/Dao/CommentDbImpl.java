/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.Dao;

import com.swcguild.contentmanagmentsystems.dto.Comment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

/**
 *
 * @author apprentice
 */
public class CommentDbImpl implements CommentDao {

    private JdbcTemplate jdbcTemplate;

    private final String SQL_DELETE_COMMENT_BY_POST_ID="delete from comments where post_id=?";
    
    private final String SQL_INSERT_COMMENT
            = "insert into comments (post_Id, username, email, comment_content, comment_date) values (?,?,?, ?,?)";

    private final String SQL_SELECT_COMMENT_BY_ID
            = "select * from comments where comment_Id = ?";

    private final String SQL_DELETE_COMMENT
            = "delete from comments where comment_Id = ?";

    private final String SQL_UPDATE_COMMENT
            = "update comments set post_Id=?, username=?, email=?, "
            + "comment_content=?, comment_date=?, comment_publish=? where comment_Id=?";

    private final String SQL_SELECT_COMMENT_BY_POST_ID
            = "select * from comments where post_Id =?";

    private final String SQL_SELECT_COMMENT_BY_USER_ID
            = "select * from comments where user_Id = ?";

    private final String SQL_SELECT_ALL_COMMENTS
            = "select * from comments";
    
    private final String SQL_UPDATE_COMMENT_PUBLISH ="update comments set comment_publish=? where comment_Id=?";
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Comment addComment(Comment comment) {
        jdbcTemplate.update(SQL_INSERT_COMMENT, comment.getPostId(), comment.getUserName(), comment.getEmail(), comment.getCommentText(), comment.getCommentDate());
        comment.setCommentId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return comment;
    }

    @Override
    public Comment getComment(int commentId) {
        return jdbcTemplate.queryForObject(SQL_SELECT_COMMENT_BY_ID, new CommentMapper(), commentId);

    }

    @Override
    public void deleteComment(int commentId) {
        jdbcTemplate.update(SQL_DELETE_COMMENT, commentId);
    }

    @Override
    public void editComment(Comment comment) {
        jdbcTemplate.update(SQL_UPDATE_COMMENT,
                comment.getPostId(),
                comment.getUserName(),
                comment.getEmail(),
                comment.getCommentText(),
                comment.getCommentDate(),
                comment.isCommentPublish(),
                comment.getCommentId());

    }

    @Override
    public List<Comment> getCommentByPostId(int postId) {
        List<Comment> a = jdbcTemplate.query(SQL_SELECT_COMMENT_BY_POST_ID,
                new CommentMapper(), postId);
        return a;
    }

    @Override
    public List<Comment> getCommentByUserId(int userId) {
        List<Comment> a = jdbcTemplate.query(SQL_SELECT_COMMENT_BY_USER_ID,
                new CommentMapper(), userId);
        return a;
    }

    @Override
    public List<Comment> getAllComments() {
        List<Comment> a = jdbcTemplate.query(SQL_SELECT_ALL_COMMENTS, new CommentMapper());
        return a;
    }

    @Override
    public void publish(int id) {
        jdbcTemplate.update(SQL_UPDATE_COMMENT_PUBLISH,true,id);
    }

    @Override
    public void unpublish(int id) {
        
        jdbcTemplate.update(SQL_UPDATE_COMMENT_PUBLISH,false,id);
    }

    @Override
    public void deleteCommentsForPost(int postId) {
        jdbcTemplate.update(SQL_DELETE_COMMENT_BY_POST_ID,postId);
    }

    private static class CommentMapper implements ParameterizedRowMapper<Comment> {

        @Override
        public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
            Comment comment = new Comment();
            comment.setCommentId(rs.getInt("comment_Id"));
            comment.setPostId(rs.getInt("post_Id"));
            comment.setUserName(rs.getString("username"));
            comment.setEmail(rs.getString("email"));
            comment.setCommentText(rs.getString("comment_content"));
            comment.setCommentDate(rs.getDate("comment_date"));
            comment.setCommentPublish(rs.getBoolean("comment_publish"));

            return comment;
        }

    }

}
