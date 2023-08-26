package org.example;

public class Chocolate extends Product {

    int weight;
    public Chocolate(String name, String brand, double price,int weight ) {

        super(name, brand, price);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String displayInfo(){

        return String.format("[Шоколад] %s -  %s - %2f Вес: %d", name, brand, price, weight);
    }
}
