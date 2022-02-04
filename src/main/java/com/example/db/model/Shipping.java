package com.example.db.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="shipping")
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shipping_id;
    String locations;
    String date_from;
    String date_to;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    @ManyToOne
    @JoinColumn(name = "shopping_id")
    public ShoppingBag shoppingBag;

    public Shipping(Integer shipping_id, String locations, String date_from, String date_to, User user, ShoppingBag shoppingBag) {
        this.shipping_id = shipping_id;
        this.locations = locations;
        this.date_from = date_from;
        this.date_to = date_to;
        this.user = user;
        this.shoppingBag = shoppingBag;
    }

    public Shipping() {

    }

    public Integer getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(Integer shipping_id) {
        this.shipping_id = shipping_id;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ShoppingBag getShoppingBag() {
        return shoppingBag;
    }

    public void setShoppingBag(ShoppingBag shoppingBag) {
        this.shoppingBag = shoppingBag;
    }
}