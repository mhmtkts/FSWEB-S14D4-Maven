package org.example.model;

public class Coke extends ProductForSale{
    private int calories;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, int calories) {
        super(type, price, description);
        this.calories = calories;
    }



    @Override
    public void showDetails() {
        System.out.println(super.toString()+ this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "calories=" + calories +
                '}';
    }
}
