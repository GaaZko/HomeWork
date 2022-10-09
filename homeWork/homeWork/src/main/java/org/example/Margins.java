package org.example;

import java.util.ArrayList;
import java.util.List;

public class Margins {
    private String category;
    private String margin;

     static List<Margins> marginsList = new ArrayList<Margins>();

    public Margins() {
    }

    public Margins(String category, String margin) {
        this.category = category;
        this.margin = margin;
        marginsList.add(this);
    }

    public String getCategory() {
        return category;
    }

    public String getMargin() {
        return margin;
    }

    public static Double getMarginsOfCategory(String category){
        String result = "";
        Double cost = 0.0;
        if (category == null) return null;
        for (Margins margins : marginsList){
            if (margins.getCategory().equals(category)){
                result =  margins.getMargin();
                break;
            }
        }
        if (result.contains("%")){
            result = result.replace("%","");
            return Double.valueOf(result)/100 + 1;
        }

        return Double.valueOf(result) + 1;
    }
}
