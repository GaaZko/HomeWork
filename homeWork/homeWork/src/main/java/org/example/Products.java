package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Products {
    private String product;
    private String group;
    private Double cost;

    static List<Products> products = new ArrayList<Products>();

    public Products() {
    }

    public Products(String product, String group, Double cost) {
        this.product = product;
        this.group = group;
        this.cost = cost;
        products.add(this);
    }

    public List<Products> getProducts() {
        return products;
    }


    public String getProduct() {
        return product;
    }

    public String getGroup() {
        return group;
    }

    public Double getCost() {
        return cost;
    }

    public static String getCategory(Products products) {
        return Category.getCategoryOfProduct(products);
    }

    public static double getMargin(Products products) {
        return Margins.getMarginsOfCategory(getCategory(products));
    }

    public static void getAveragePriceByGroup() {
        HashMap<String, Double> sumTotalPriceByGroup = new HashMap<String, Double>();
        HashMap<String, Double> sumOfProductsByGroup = new HashMap<String, Double>();

        for (Products product : products) {
            sumOfProductsByGroup.put(product.getGroup(), sumOfProductsByGroup.get(product.getGroup()) == null ? 1 : sumOfProductsByGroup.get(product.getGroup()) + 1);
            sumTotalPriceByGroup.put(product.getGroup(), sumTotalPriceByGroup.get(product.getGroup()) == null ? product.getCost() * getMargin(product) : sumTotalPriceByGroup.get(product.getGroup()) + (product.getCost() * getMargin(product)));
        }

        for (String key : sumOfProductsByGroup.keySet()) {
            sumOfProductsByGroup.put(key, sumTotalPriceByGroup.get(key) / sumOfProductsByGroup.get(key));
            System.out.println(key + " " + sumOfProductsByGroup.get(key));
        }
    }
}
