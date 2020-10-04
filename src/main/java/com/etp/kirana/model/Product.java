package com.etp.kirana.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    private long id;
    private String productName;
    private long productPrice;

    public Product() {

    }

    public Product(long id, String productName, long productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "product_name", nullable = false)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Column(name = "product_price", nullable = false)
    public long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
