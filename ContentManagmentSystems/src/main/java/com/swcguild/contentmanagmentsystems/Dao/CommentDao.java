/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.Dao;

import com.swcguild.contentmanagmentsystems.dto.Comment;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface CommentDao {

    public Comment addComment(Comment comment);

    public Comment getComment(int commentId);

    public void deleteComment(int commentId);

    public void editComment(Comment comment);

    public List<Comment> getCommentByPostId(int postId);

    public List<Comment> getCommentByUserId(int userId);
    
    public List<Comment> getAllComments();
    
    public void publish(int id);
    
    public void unpublish(int id);
    
    public void deleteCommentsForPost(int postId);

}
