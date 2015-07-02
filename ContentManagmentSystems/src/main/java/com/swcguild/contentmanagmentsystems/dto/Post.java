/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.dto;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Post {
    private int postId;
    private int userId;
    private List<String> categors = new ArrayList<>();
    private List<String> tags = new ArrayList<>();
    private Date date;
    private boolean approved;
    private String body;
    private String title;
   
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

  

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public List<String> getCategors() {
        return categors;
    }

    public void setCategors(List<String> categors) {
        this.categors = categors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.postId;
        hash = 41 * hash + this.userId;
        hash = 41 * hash + Objects.hashCode(this.categors);
        hash = 41 * hash + Objects.hashCode(this.date);
        hash = 41 * hash + (this.approved ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.body);
        hash = 41 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        if (this.postId != other.postId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        if (!Objects.equals(this.categors, other.categors)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (this.approved != other.approved) {
            return false;
        }
        if (!Objects.equals(this.body, other.body)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

   
    
    
    
}
