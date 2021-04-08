package com.libray.mng.model;
import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "authorid")
    private Integer authorId;
    @Column(name = "authorname")
    private String authorName;
    @Column(name = "authorname")
    private Integer authorAge;
    @Column(name = "publishedbooks")
    private Integer publishedBooks;

    public Authors() {

    }

    public Authors(Integer authorId, String authorName, Integer authorAge, Integer publishedBooks) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorAge = authorAge;
        this.publishedBooks = publishedBooks;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(Integer authorAge) {
        this.authorAge = authorAge;
    }

    public Integer getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(Integer publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorAge=" + authorAge +
                ", publishedBooks=" + publishedBooks +
                '}';
    }
}
