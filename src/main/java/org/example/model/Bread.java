package org.example.model;

public class Bread extends ProductForSale{
    private int gramaj;

    public Bread(String type, double price, String description) {
        super(type, price, description);

    }

    public Bread(String type, double price, String description, int gramaj) {
        super(type, price, description);
        this.gramaj = gramaj;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+ this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "gramaj=" + gramaj +
                '}';
    }
}
