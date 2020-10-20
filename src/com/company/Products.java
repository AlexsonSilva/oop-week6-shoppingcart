package com.company;

import java.util.ArrayList;

public class Products {

        //String Products = new ArrayList();
        private String products;
        private double price;
        private int quantity;

    public Products(String products, double price) {
    }

    public String getProducts () {
            return products;
        }
        public void setProducts (String products){
            this.products = products;
        }

     public int getQuantity(){
        return quantity;
     }
        public void setQuantity(int quantity){
            this.quantity = quantity;
     }
    private static void add(double price) {
    }
        public double getPrice () {
            return price;
        }
        public void setPrice ( double price){
            Products.add(price);
        }

}
