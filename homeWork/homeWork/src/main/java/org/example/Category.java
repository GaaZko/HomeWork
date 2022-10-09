package org.example;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String category;
    private Integer CostRangeFrom;
    private Integer CostRangeTo;

    static List<Category> categories = new ArrayList<Category>();

    public Category() {
    }

    public Category(String category, Integer costRangeFrom, Integer costRangeTo) {
        this.category = category;
        CostRangeFrom = costRangeFrom;
        CostRangeTo = costRangeTo;
        categories.add(this);
    }

    public String getCategory() {
        return category;
    }

    public Integer getCostRangeFrom() {
        return CostRangeFrom;
    }

    public Integer getCostRangeTo() {
        return CostRangeTo;
    }
    public static String getCategoryOfProduct(Products products) {

        for (Category category : categories) {
            if (category.getCostRangeFrom() < products.getCost() && (category.getCostRangeTo() == null || category.getCostRangeTo() > products.getCost())){
                return category.getCategory();
            }
        }
        return null;
    }



}
