package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {

    abstract List<Post> showAllPosts();

    abstract void createPost(String title, String url);

    abstract Post findPostById(Long postId) throws Exception;

    abstract void scoreUp(Long postId) throws Exception;

    abstract void scoreDown(Long postId) throws Exception;

    abstract List<Post> findAllByHighestScore();
}
