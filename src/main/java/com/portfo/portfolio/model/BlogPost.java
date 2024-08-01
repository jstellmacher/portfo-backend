package com.portfo.portfolio.model;

import java.util.List;

public class BlogPost {
    private Long id;
    private String title;
    private String date;
    private String content;
    private String imageUrl;
    private boolean published;
    private List<String> tags;

    public BlogPost(Long id, String title, String date, String content, String imageUrl, boolean published, List<String> tags) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
        this.imageUrl = imageUrl;
        this.published = published;
        this.tags = tags;
    }

    // Getters and setters
}
