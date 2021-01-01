package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PostController {

    private final PostService postService;
    private final UserService userService;

    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/posts/user={userId}")
    public String showAllPosts(@PathVariable(value = "userId") Long userId, Model model) throws Exception {
        model.addAttribute("posts", postService.showAllPosts());
        model.addAttribute("user", this.userService.findUserById(userId));
        return "all-posts";
    }

    @GetMapping("/create-post/user={userId}")
    public String showCreatePage(@PathVariable(value = "userId") Long userId, Model model) throws Exception {
        model.addAttribute("user", this.userService.findUserById(userId));
        return "create-post";
    }

    @PostMapping("/create-post/user={userId}")
    public String createPost(@PathVariable(value = "userId") Long userId, @ModelAttribute Post newPost) throws Exception {
        this.postService.createPost(newPost.getTitle(), newPost.getUrl(), this.userService.findUserById(userId));
        return "redirect:/posts/user=" + userId;
    }

    @PostMapping("/upScore/{id}")
    public String scorePlusOne(@PathVariable(value = "id") Long postId) throws Exception {
        postService.scoreUp(postId);
        return "redirect:/posts";
    }

    @PostMapping("/downScore/{id}")
    public String scoreMinusOne(@PathVariable(value = "id") Long postId) throws Exception {
        postService.scoreDown(postId);
        return "redirect:/posts";
    }

    @GetMapping("/showPost/postId={id}/user={userId}")
    public String showSinglePost(@PathVariable(value = "id") Long postId,
                                 @PathVariable(value = "userId") Long userId, Model model) throws Exception {
        model.addAttribute("post", postService.findPostById(postId));
        model.addAttribute("user", userService.findUserById(userId));
        return "show-post";
    }
}
