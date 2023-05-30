package ru.nonton;

import ru.nonton.impl.ProductsImpl;
import ru.nonton.model.Product;

public class Main {
    public static void main(String[] args) {
        ProductsImpl products = new ProductsImpl();

        System.out.println(products.addNewProduct(new Product("10", "Test")));
        System.out.println(products.addNewProduct(new Product("102", "Test")));
        System.out.println(products.addNewProduct(new Product("101", "Test")));
        System.out.println(products.addNewProduct(new Product("10", "Test2")));
        System.out.println(products.addNewProduct(new Product("108", "Test2")));
        System.out.println(products.addNewProduct(new Product("109", "Test2")));
        System.out.println(products.deleteProduct(new Product("105", "Test2")));
        System.out.println(products.deleteProduct(new Product("102", "Test2")));
        System.out.println(products.findByName("Test"));
        System.out.println(products.findByName("Test2"));
        System.out.println(products.findByName("Test3"));
        System.out.println(products.getProduct("109"));
        System.out.println(products.getProduct("1019"));
        System.out.println(products.getProduct("109"));
    }
}