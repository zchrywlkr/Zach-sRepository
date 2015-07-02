/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.Dao;

import com.swcguild.contentmanagmentsystems.dto.Post;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface PostDao {
    public Post addPost(Post post);
    public Post addPost(Post post,List<String> categoryIds);
    public Post getPost(int postId);
    public List<String> getCategories(Post post);
    public Map<Integer,String> getCategoriesWithIndex();
    public void addCategory(String str);
    public void addTag(List<String> str,Post post);
    public List<String> getPosts(Post post);
    public  List<String> getTagsForPost(Post post);
    public List<Post> getPostsByLastDates(int num);
    public List<Post> getPosts(int num);
    public void deletePost(int id);
    public void updatePost(Post post);
    public void updateTagsCategories(Post post);
    public Map<Integer,String> getCategoriesByOccurence();
    public Map<Integer,String> getTagByOccurence();
    public List<Post> getPostByCategories(String category);
    public List<Post> getPostByTag(String tag);
    public void updateCategory(int id,String value);
    public  void updateTags(int id, String value);
    public void deleteCategory(int id);
    public Map<Integer,String> getTagWithindex();
    public void deleteTag(int id);
    public void publishPost(int id);
    public void unpublishPost(int id);

}
