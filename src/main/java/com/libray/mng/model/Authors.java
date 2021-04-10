package com.libray.mng.model;
import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorid")
    private Integer authorid;
    @Column(name = "authorname")
    private String authorname;
    @Column(name = "authorage")
    private Integer authorage;
    @Column(name = "publishedbooks")
    private Integer publishedbooks;

    public Authors() {

    }

    public Authors(String authorname, Integer authorage, Integer publishedbooks) {
        this.authorname = authorname;
        this.authorage = authorage;
        this.publishedbooks = publishedbooks;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public Integer getAuthorage() {
        return authorage;
    }

    public void setAuthorage(Integer authorage) {
        this.authorage = authorage;
    }

    public Integer getPublishedbooks() {
        return publishedbooks;
    }

    public void setPublishedbooks(Integer publishedbooks) {
        this.publishedbooks = publishedbooks;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "authorid=" + authorid +
                ", authorname='" + authorname + '\'' +
                ", authorage=" + authorage +
                ", publishedbooks=" + publishedbooks +
                '}';
    }
}
