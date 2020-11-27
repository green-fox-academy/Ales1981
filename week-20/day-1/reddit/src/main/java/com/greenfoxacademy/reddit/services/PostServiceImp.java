package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImp implements PostService {
    private final PostRepository postRepository;

    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> showAllPosts() {
        List<Post> allPosts = new ArrayList<>();
        postRepository.findAll().forEach(allPosts::add);
        return allPosts;
    }

    @Override
    public void createPost(String title, String url) {
        postRepository.save(new Post(title, url));
    }

    @Override
    public Post findPostById(Long postId) throws Exception {
        Post postToReturn = postRepository.findById(postId).orElse(null);
        if (postToReturn != null) {
            return postToReturn;
        } else {
            throw new Exception("Id not found");
        }
    }

    @Override
    public void scoreUp(Long postId) throws Exception {
        Post whichToUpScore = postRepository.findById(postId).orElse(null);
        if (whichToUpScore != null) {
            whichToUpScore.scorePlusOne();
            postRepository.save(whichToUpScore);
        } else {
            throw new Exception("Id not found");
        }
    }

    @Override
    public void scoreDown(Long postId) throws Exception {
        Post whichToDownScore = postRepository.findById(postId).orElse(null);
        if (whichToDownScore != null) {
            whichToDownScore.scoreMinusOne();
            postRepository.save(whichToDownScore);
        } else {
            throw new Exception("Id not found");
        }
    }
}
