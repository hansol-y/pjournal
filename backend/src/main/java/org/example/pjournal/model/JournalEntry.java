package org.example.pjournal.model;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false, nullable = false)
    private Long id;

    @Column(name="title", nullable = false)
    private String title;
    @Column(name="contents", nullable = false)
    private String contents;
    @Column(name="image", nullable = false)
    private String imageUri;
    @Column(name="created_at")
    private LocalDateTime createdAt;

    protected JournalEntry() {
        this.createdAt = LocalDateTime.now();
    }

    @Builder
    public JournalEntry(String title, String contents, String imageUri) {
        this.title = title;
        this.contents = contents;
        this.imageUri = imageUri;

        this.createdAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        // TEST PURPOSE ONLY
        this.createdAt = createdAt;
    }

}
