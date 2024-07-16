package com.texas;

import com.texas.dao.ProductDAO;
import com.texas.model.Product;

public class Main {
    public static void main(String[] args) {
        ProductDAO productDAO=new ProductDAO();

//        Product product=new Product("Samsung A20","10000","MOBILE");
//        productDAO.saveProduct(product);

        System.out.println(productDAO.getAllProducts());
        System.out.println(productDAO.getById(1));
    }
}