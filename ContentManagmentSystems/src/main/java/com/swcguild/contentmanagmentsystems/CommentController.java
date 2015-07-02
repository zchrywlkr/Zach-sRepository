/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems;

import com.swcguild.contentmanagmentsystems.Dao.CommentDao;
import com.swcguild.contentmanagmentsystems.dto.Comment;
import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author apprentice
 */
@Controller
public class CommentController {

    private CommentDao commentDao;

    @Inject
    public CommentController(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    @RequestMapping(value = "/testCommentPage", method = RequestMethod.GET)
    public String getCommentTestPage() {
        return "testCommentPage";
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> getAllComments() {
        return commentDao.getAllComments();
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable("id") int id) {
        commentDao.deleteComment(id);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Comment getCommentById(@PathVariable("id") int commentId) {
        return commentDao.getComment(commentId);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void editComment(@PathVariable("id") int commentId, @RequestBody Comment comment) {
        comment.setCommentId(commentId);
        Date testDate = new Date(System.currentTimeMillis());
        comment.setCommentPublish(true);
        comment.setCommentDate(testDate);
        commentDao.editComment(comment);
    }

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Comment addComment(@RequestBody Comment comment) {

        Date testDate = new Date(System.currentTimeMillis());
        
        comment.setCommentPublish(true);
        comment.setCommentDate(testDate);
        return commentDao.addComment(comment);
    }

    @RequestMapping(value = "commmentByPost/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> getCommentByPost(@PathVariable("id") int id) {
        return commentDao.getCommentByPostId(id);
    }
    
    @RequestMapping(value= "publishComment/{id}",method= RequestMethod.PUT)
    @ResponseBody
    public void publishComment(@PathVariable("id") int id){
        commentDao.publish(id);
        
    }
    
    @RequestMapping(value="unpublishComment/{id}",method=RequestMethod.PUT)
    @ResponseBody
    public void unpublishComment(@PathVariable("id") int id){
        commentDao.unpublish(id);
        
    }
}
