package ru.skypro.homework.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int author;
    private String authorImage;
    private String authorFirstName;
    private int createdAt;
    private int pk;
    private String text;
    @ManyToOne
    @JoinColumn(name = "announcements_author")
    @JsonIgnore
    private Announcemenst announcemenst;

    public Comment(int author, String authorFirstName, String authorImage, int createdAt, int pk,
                   String text,Announcemenst announcemenst) {
        this.author = author;
        this.authorFirstName = authorFirstName;
        this.authorImage = authorImage;
        this.createdAt = createdAt;
        this.pk = pk;
        this.text = text;
        this.announcemenst=announcemenst;
    }

    public Comment() {
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Announcemenst getAnnouncemenst() {
        return announcemenst;
    }

    public void setAnnouncemenst(Announcemenst announcemenst) {
        this.announcemenst = announcemenst;
    }
}
