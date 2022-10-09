package org.example;

public class Main {
    public static void main(String[] args) {


        Products products = new Products("A", "G1", 20.1);
        Products products2 = new Products("B", "G2", 98.4);
        Products products3 = new Products("C", "G1", 49.7);
        Products products4 = new Products("D", "G3", 35.8);
        Products products5 = new Products("E", "G3", 105.5);
        Products products6 = new Products("F", "G1", 55.2);
        Products products7 = new Products("G", "G1", 12.7);
        Products products8 = new Products("H", "G3", 88.6);
        Products products9 = new Products("I", "G1", 5.2);
        Products products10 = new Products("J", "G2", 72.4);


        Category category = new Category("C3", 50, 75);
        Category category2 = new Category("C4", 75, 100);
        Category category3 = new Category("C2", 25, 50);
        Category category4 = new Category("C5", 100, null);
        Category category5 = new Category("C1", 0, 25);


        Margins margin = new Margins("C1", "20%");
        Margins margin1 = new Margins("C2","30%");
        Margins margin2 = new Margins("C3","0.47");
        Margins margin3 = new Margins("C4", "50%");
        Margins margin4 = new Margins("C5","0.66");

        Products.getAveragePriceByGroup();


    }

}