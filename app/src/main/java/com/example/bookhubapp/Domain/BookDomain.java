package com.example.bookhubapp.Domain;

import java.io.Serializable;

public class BookDomain implements Serializable {
    private String title;
    private String pic;
    private String description;
    private Double fee;
    private String category;
    private int numberInCart;

    public BookDomain(String title, String pic, String description, Double fee) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
    }

    public BookDomain(String title, String pic, String description, Double fee, String category) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.category = category;
    }

    public BookDomain(String title, String pic, String description, Double fee, int numberInCart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
