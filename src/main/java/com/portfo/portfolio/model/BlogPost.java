package com.portfo.portfolio.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDate date;

    private String description;

    private String imageUrl;

    private boolean featured;

    @ElementCollection
    @CollectionTable(name = "blog_post_tags", joinColumns = @JoinColumn(name = "blog_post_id"))
    @Column(name = "tag")
    private List<String> tags;

    // Constructors
    public BlogPost() {
    }

    public BlogPost(Long id, String title, LocalDate date, String description, String imageUrl, boolean featured, List<String> tags) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.imageUrl = imageUrl;
        this.featured = featured;
        this.tags = tags;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
