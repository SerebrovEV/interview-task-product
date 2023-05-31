package ru.nonton.impl;

import ru.nonton.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Класс для реализации 4 функций (добавление, удаление, получение имени по id и получение всех id по имени)
 */
public class ProductsImpl {
    private ArrayList<Product> products = new ArrayList<>();

    /**
     * Добавляет новый продукт
     *
     * @param product
     * @return true - если продукта с таким id еще не было, false - если был такой id, вставка отменяется
     */
    public boolean addNewProduct(Product product) {
        if (products.contains(product)) {
            return false;
        }
        products.add(product);
        return true;
    }

    /**
     * Удаляет продукт
     *
     * @param product
     * @return true - если продукт с таким id был, false - если id не было, (удаления не происходит)
     */
    public boolean deleteProduct(Product product) {
        if (!products.contains(product)) {
            return false;
        }
        products.remove(product);
        return true;
    }

    /**
     * Получает имя (name) продукта
     *
     * @param id
     * @return name продукта у которого идентификатор равен (=) id
     * если продукта нет, вернет пустую строку ""
     */
    public String getProduct(String id) {
        Optional<Product> findProduct = products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
        if(findProduct.isEmpty()){
            return "";
        }
        return findProduct.get().getName();
    }

    /**
     * Возвращает массив (список) идентификаторов (id) у которых наименование равно (=) name
     * Если таких нет, возвращается пустой массив (список)
     *
     * @param name
     * @return
     */
    public List<String> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().equals(name))
                .map(Product::getId)
                .collect(Collectors.toList());
    }


}
