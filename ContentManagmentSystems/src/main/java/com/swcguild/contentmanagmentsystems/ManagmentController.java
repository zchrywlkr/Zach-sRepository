/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems;

import com.swcguild.contentmanagmentsystems.Dao.CommentDao;
import com.swcguild.contentmanagmentsystems.Dao.PostDao;
import com.swcguild.contentmanagmentsystems.Dao.StaticPageDao;
import com.swcguild.contentmanagmentsystems.dto.Post;
import com.swcguild.contentmanagmentsystems.dto.StaticPage;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class ManagmentController {

    private PostDao postDao;
    private StaticPageDao pageDao;
    private CommentDao commentDao;

    @Inject
    public ManagmentController(PostDao postDao, StaticPageDao pageDao, CommentDao commentDao) {
        this.postDao = postDao;
        this.pageDao = pageDao;
        this.commentDao = commentDao;
    }

    @RequestMapping(value = {"/returnHome", "/"}, method = RequestMethod.GET)
    public String homePage() {
        return "home";
    }

    @RequestMapping(value = "/addpost", method = RequestMethod.GET)
    public String addPost() {

        return "addPost";
    }

    @RequestMapping(value = "/newPost", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Post createPost(@RequestBody Post post) {

        String str = post.getTags().get(0);

        String[] strArray = str.split(",");

        List<String> list = Arrays.asList(strArray);

        post.setUserId(1);
        Date date = new Date(System.currentTimeMillis());

        post.setDate(date);

        post = postDao.addPost(post, post.getCategors());
        postDao.addTag(list, post);
        post = postDao.getPost(post.getPostId());

        return post;
    }

    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String createCategory(@RequestBody String str) {

        postDao.addCategory(str);
        return str;
    }

    @RequestMapping(value = "/editPost/addCategory", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String createInEditCategory(@RequestBody String str) {

        postDao.addCategory(str);
        return str;
    }

    @RequestMapping(value = "/getCategories", method = RequestMethod.GET)
    @ResponseBody
    public Map<Integer, String> getAllCategories() {

        return postDao.getCategoriesWithIndex();
    }

    @RequestMapping(value = "/tags", method = RequestMethod.GET)
    @ResponseBody
    public Map<Integer, String> getAllTags() {

        return postDao.getTagWithindex();
    }

    @RequestMapping(value = "/editPost/getCategories", method = RequestMethod.GET)
    @ResponseBody
    public Map<Integer, String> getAlltheCategories() {

        return postDao.getCategoriesWithIndex();
    }

    @RequestMapping(value = "/getPostByDate/{num}", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> listByDate(@PathVariable("num") int num) {

        List<Post> posts = postDao.getPostsByLastDates(num);
        for (Post post : posts) {
            String[] strArray = post.getBody().split(" ");

            StringBuilder sb = new StringBuilder();
            int length = 50;
            if (strArray.length < 50) {
                length = strArray.length;
            }
            for (int i = 0; i < length; i++) {
                sb.append(strArray[i]);
                sb.append(" ");
            }

            post.setBody(sb.toString());
        }

        return posts;
    }

    @RequestMapping(value = "/getPost/{num}", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> listPost(@PathVariable("num") int num) {

        List<Post> posts = postDao.getPosts(num);
        for (Post post : posts) {
            String[] strArray = post.getBody().split(" ");

            StringBuilder sb = new StringBuilder();
            int length = 50;
            if (strArray.length < 50) {
                length = strArray.length;
            }
            for (int i = 0; i < length; i++) {
                sb.append(strArray[i]);
                sb.append(" ");
            }

            post.setBody(sb.toString());
        }

        return posts;
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable("id") int id) {
        commentDao.deleteCommentsForPost(id);
        postDao.deletePost(id);
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Post getPost(@PathVariable("id") int id) {
        return postDao.getPost(id);
    }

    @RequestMapping(value = "/editPost/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model) {

        List<String> list = new ArrayList<>(postDao.getCategoriesWithIndex().values());
        Post post = postDao.getPost(id);
        model.addAttribute("post", post);
        model.addAttribute("categories", list);
        return "theEditPage";
    }
//    @RequestMapping(value = "/editPost", method = RequestMethod.GET)
//    public String editPosts(HttpServletRequest req, Model model) {
//        Post post = new Post();
//        int id = Integer.parseInt(req.getParameter("postId"));
//        
//        post = postDao.getPost(id);
//        
//        model.addAttribute("post",post);
//        return  "editPost";
//    }       

    @RequestMapping(value = "editPost/getTags/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Post getTagsByPost(@PathVariable("id") int id) {

        return postDao.getPost(id);
    }

//    @RequestMapping(value="editPost/SaveChange",method=RequestMethod.PUT)
//     public String editPost(HttpServletRequest req){
//         int id = Integer.parseInt(req.getParameter("thePostId"));
//         String body = req.getParameter("area");
//         String title = req.getParameter("titleInput");
//         Post post = postDao.getPost(id);
//         post.setBody(body);
//         post.setTitle(title);
//         postDao.updatePost(post);
//         return "redirect:home";
//     }
    @RequestMapping(value = "editPost/SaveChange", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    String editPost(@RequestBody Post post) {

        String str = post.getTags().get(0);

        String[] strArray = str.split(",");

        List<String> list = Arrays.asList(strArray);
        post.setTags(list);
        postDao.updateTagsCategories(post);
        postDao.updatePost(post);

        return "redirect:home";
    }

    @RequestMapping(value = "addStaticPagePage", method = RequestMethod.GET)
    String getAddStaticPagePage() {

        return "addStaticPagePage";
    }

    @RequestMapping(value = "addStaticPage", method = RequestMethod.POST)
    public String getAddStaticPage(HttpServletRequest req, Model model) {
        StaticPage page = new StaticPage();
        page.setBody(req.getParameter("area"));
        page.setTitle(req.getParameter("PagetitleInput"));
        page.setIndex(pageDao.getAllStaticPage().size());

        pageDao.addPage(page);
        return "redirect:";
    }

    @RequestMapping(value = "getnavbar", method = RequestMethod.GET)
    @ResponseBody
    public List<StaticPage> getNavBarPages() {
        return pageDao.getAllStaticPage();
    }

    @RequestMapping(value = "getStaticPage/{id}", method = RequestMethod.GET)
    public String getStaticPage(@PathVariable("id") int id, Model model) {
        StaticPage page = pageDao.getPage(id);
        model.addAttribute("page", page);

        return "StaticPage";

    }

    @RequestMapping(value = "getCategoriesByOccurence", method = RequestMethod.GET)
    @ResponseBody
    public Map<Integer, String> getCategoriesByOccurence() {

        return postDao.getCategoriesByOccurence();
    }

    @RequestMapping(value = "getTagsByOccurence", method = RequestMethod.GET)
    @ResponseBody
    public Map<Integer, String> getTagByOccurence() {

        return postDao.getTagByOccurence();
    }

    @RequestMapping(value = "editStaticPage/{id}", method = RequestMethod.GET)
    public String editStaticPage(@PathVariable("id") int id, Model model) {

        StaticPage page = pageDao.getPage(id);
        model.addAttribute("page", page);
        return "editStaticPagePage";

    }

    @RequestMapping(value = "saveChangePage", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void saveChangesStaticPage(@RequestBody StaticPage page) {

        pageDao.editPage(page);

    }

    @RequestMapping(value = "orderStaticPage", method = RequestMethod.GET)
    @ResponseBody
    List<StaticPage> reorderPagePage() {

        return pageDao.getAllStaticPage();
    }

    @RequestMapping(value = "changeOrder", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void changeOrder(@RequestBody StaticPage page) {
        StaticPage page2 = pageDao.getPage(page.getId());
        pageDao.setIndex(page2, page.getIndex());

    }

    @RequestMapping(value = "deleteStaticPage/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteStaticPage(@PathVariable("id") int id) {

        pageDao.deletePage(id);
    }

    @RequestMapping(value = "getByCategory/{category}", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> getPostByCategories(@PathVariable("category") String category) {
        List<Post> posts = postDao.getPostByCategories(category);
        for (Post post : posts) {
            String[] strArray = post.getBody().split(" ");

            StringBuilder sb = new StringBuilder();
            int length = 50;
            if (strArray.length < 50) {
                length = strArray.length;
            }
            for (int i = 0; i < length; i++) {
                sb.append(strArray[i]);
                sb.append(" ");
            }

            post.setBody(sb.toString());
        }

        return posts;
    }

    @RequestMapping(value = "getByTag/{tag}", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> getPostByTag(@PathVariable("tag") String Tag) {

        List<Post> posts = postDao.getPostByTag(Tag);
        for (Post post : posts) {
            String[] strArray = post.getBody().split(" ");

            StringBuilder sb = new StringBuilder();
            int length = 50;
            if (strArray.length < 50) {
                length = strArray.length;
            }
            for (int i = 0; i < length; i++) {
                sb.append(strArray[i]);
                sb.append(" ");
            }

            post.setBody(sb.toString());
        }
        return posts;
    }

    @RequestMapping(value = "updateCategory", method = RequestMethod.PUT)
    @ResponseBody
    public void updateCategory(@RequestBody Map<String, String> set) {

        int id = Integer.parseInt(set.get("key"));
        String value = set.get("value");

        postDao.updateCategory(id, value);

    }

    @RequestMapping(value = "updateTag", method = RequestMethod.PUT)
    @ResponseBody
    public void updateTag(@RequestBody Map<String, String> set) {

        int id = Integer.parseInt(set.get("key"));
        String value = set.get("value");

        postDao.updateTags(id, value);

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm() {
        return "login";
    }

    @RequestMapping(value = "category/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCategory(@PathVariable("id") int id) {
        postDao.deleteCategory(id);
    }

    @RequestMapping(value = "tag/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteTag(@PathVariable("id") int id) {
        postDao.deleteTag(id);
    }

    @RequestMapping(value = "publish/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void publishPost(@PathVariable("id") int id) {
        postDao.publishPost(id);
    }

    @RequestMapping(value = "unpublish/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void unpublishPost(@PathVariable("id") int id) {
        postDao.unpublishPost(id);
    }
}
