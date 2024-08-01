package com.portfo.portfolio.service;

import com.portfo.portfolio.model.BlogPost;
import com.portfo.portfolio.repository.BlogPostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private final BlogPostRepository blogPostRepository;

    public DataLoader(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<BlogPost> posts = Arrays.asList(
            new BlogPost(1L, "First Blog Post", "June 1, 2024", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "https://picsum.photos/200/310", true, Arrays.asList("coding", "web development", "javascript")),
            new BlogPost(2L, "Second Blog Post", "June 5, 2024", "Nulla quis lorem ut libero malesuada feugiat.", "https://picsum.photos/200/307", false, Arrays.asList("project management", "ux/ui"))
            // Add other dummy data similarly
        );

        blogPostRepository.saveAll(posts);
    }
}
