package com.portfo.portfolio.service;

import com.portfo.portfolio.model.BlogPost;
import com.portfo.portfolio.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    public Optional<BlogPost> getPostById(Long id) {
        return blogPostRepository.findById(id);
    }

    public BlogPost savePost(BlogPost post) {
        return blogPostRepository.save(post);
    }

    public void deletePost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
