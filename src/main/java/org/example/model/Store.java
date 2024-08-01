package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] product = new ProductForSale[4];
        product[0] = new Bread("tam buğday", 20,"sağlıklı", 100);
        product[1] = new Chocolate("white",100,"delicious","milka");
        product[2] = new Coke("Zero",50,"only cola",250);

        listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}