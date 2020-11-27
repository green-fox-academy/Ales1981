package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String showAllPosts(Model model) {
        model.addAttribute("posts", postService.showAllPosts());
        return "all-posts";
    }

    @GetMapping("/create")
    public String showCreatePage() {
        return "create-post";
    }

    @PostMapping("/create")
    public String createPost(@RequestParam String title, @RequestParam String url, Model model) {
        model.addAttribute("title", title);
        model.addAttribute("url", url);
        postService.createPost(title, url);
        return "redirect:/posts";
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

    @GetMapping("/showPost/{id}")
    public String showSinglePost(@PathVariable(value = "id") Long postId, Model model) throws Exception {
        model.addAttribute("post", postService.findPostById(postId));
        return "show-post";
    }
}
