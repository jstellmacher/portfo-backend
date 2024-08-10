package com.portfo.portfolio.repository;

import com.portfo.portfolio.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}

