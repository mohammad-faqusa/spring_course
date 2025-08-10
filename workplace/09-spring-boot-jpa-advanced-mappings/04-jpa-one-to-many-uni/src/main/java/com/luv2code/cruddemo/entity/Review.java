package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="comment")
    private String comment;

    public Review() {
    }

    public Review(String title) {
        this.comment = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return comment;
    }

    public void setTitle(String title) {
        this.comment = title;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", title='" + comment + '\'' +
                '}';
    }
}
