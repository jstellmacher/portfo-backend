package com.portfo.portfolio.controller;

import com.portfo.portfolio.model.BlogPost;
import com.portfo.portfolio.repository.BlogPostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogPostController {
    private final BlogPostRepository blogPostRepository;

    public BlogPostController(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @GetMapping("/blogposts")
    public List<BlogPost> getBlogPosts() {
        return blogPostRepository.findAll();
    }
}
