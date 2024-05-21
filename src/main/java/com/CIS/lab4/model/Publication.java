package com.CIS.lab4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "publication_title")
    private String title;

    @Column(name = "publication_author")
    private String author;

    @Column(name = "publication_year")
    private Integer year;

    @Column(name = "publication_publisher")
    private String publisher;

    @Column(name = "publication_page_count")
    private Integer pageCount;

    // Constructors, getters, and setters
    // Constructor

    public Publication() {
    }

    public Publication(String title, String author, int year, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = Integer.valueOf(year);
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    // Getters and Setters

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // toString method

    @Override
    public String toString() {
        return "Publication{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}

