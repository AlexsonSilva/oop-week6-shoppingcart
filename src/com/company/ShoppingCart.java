package com.company;

public class ShoppingCart extends Products {
    private final double Price;
    private final String Products;
    private final int quantity;

    public ShoppingCart(String Products, double Price, int quantity){
        super(Products, Price);
        this.Products = Products;
        this.Price = Price;
        this.quantity = quantity;

        double totalPayment = quantity * Price;

    }
}
