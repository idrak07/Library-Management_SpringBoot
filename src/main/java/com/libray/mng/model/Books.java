package com.libray.mng.model;
import javax.persistence.*;

@Entity
public class Books {

    /*Variable Declaration*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "authorid")
    private Integer authorId;
    @Column(name = "qty")
    private int qty;

    @Column(name = "price")
    private double price;

    public Books() {
    }

    public Books(Integer id, String name, Integer authorId, int qty, double price) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
        this.qty = qty;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorId=" + authorId +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
