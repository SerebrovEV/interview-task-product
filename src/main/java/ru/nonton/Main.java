package ru.nonton;

import ru.nonton.impl.ProductsImpl;
import ru.nonton.model.Product;

/**
 * Класс для проверки работы класса {@link ProductsImpl}
 */
public class Main {
    public static void main(String[] args) {
        ProductsImpl productsImpl = new ProductsImpl();

        //Добавление продукта
        System.out.println(productsImpl.addNewProduct(new Product("1", "Product1")));
        System.out.println(productsImpl.addNewProduct(new Product("2", "Product2")));
        System.out.println(productsImpl.addNewProduct(new Product("3", "Product3")));
        System.out.println(productsImpl.addNewProduct(new Product("4", "Product4")));
        System.out.println(productsImpl.addNewProduct(new Product("5", "Product4")));
        System.out.println(productsImpl.addNewProduct(new Product("6", "Product4")));
        System.out.println(productsImpl.addNewProduct(new Product("4", "Product5")));


        // Получение имя продукта по id
        System.out.println(productsImpl.getProduct("1"));
        System.out.println(productsImpl.getProduct("2"));
        System.out.println(productsImpl.getProduct("10"));

        // Получение списка идентификаторов (id) по имени
        System.out.println(productsImpl.findByName("Product1"));
        System.out.println(productsImpl.findByName("Product4"));
        System.out.println(productsImpl.findByName("Product10"));

        // Удаление продукта
        System.out.println(productsImpl.deleteProduct(new Product("1", "Product1")));
        System.out.println(productsImpl.getProduct("1"));

    }
}