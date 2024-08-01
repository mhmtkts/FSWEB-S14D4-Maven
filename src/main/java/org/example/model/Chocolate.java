package org.example.model;

public class Chocolate extends ProductForSale{
    private String brand;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    public Chocolate(String type, double price, String description, String name) {
        super(type, price, description);
        this.brand = name;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+ this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
