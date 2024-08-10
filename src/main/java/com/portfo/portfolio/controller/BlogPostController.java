package com.portfo.portfolio.controller;

import com.portfo.portfolio.model.BlogPost;
import com.portfo.portfolio.service.BlogPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @GetMapping
    public List<BlogPost> getAllPosts() {
        return blogPostService.getAllPosts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogPost> getPostById(@PathVariable Long id) {
        Optional<BlogPost> post = blogPostService.getPostById(id);
        return post.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public BlogPost createPost(@RequestBody BlogPost post) {
        return blogPostService.savePost(post);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BlogPost> updatePost(@PathVariable Long id, @RequestBody BlogPost post) {
        if (!blogPostService.getPostById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        post.setId(id);
        return ResponseEntity.ok(blogPostService.savePost(post));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        if (!blogPostService.getPostById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        blogPostService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}
