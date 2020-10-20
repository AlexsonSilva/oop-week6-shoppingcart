package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    }
    public class Products{
        private String products;
        private  String price;

        public String getProducts(){
            return products;
        }
        public void setProducts(String products){
            this.products = products;
        }
        public String getPrice(){
            return price;
        }
        public void setPrice(String price){
            this.price = price;
        }

        ArrayList<Products> listProducts = new ArrayList<Products>();
    }
}
