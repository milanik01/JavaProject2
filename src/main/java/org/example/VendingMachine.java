package org.example;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;

    }


    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {

            if (product instanceof BottleOfWater) {

                BottleOfWater bottleOfWater;
                bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }

            }


        }

        return null;
    }

    public Chocolate getChocolate(String name, int weight ) {
        for (Product product : products) {

            if (product instanceof Chocolate) {

                Chocolate chocolate;
                chocolate = (Chocolate) product;
                if (chocolate.getName().equals(name) && chocolate.getWeight() == weight) {
                    return chocolate;
                }

            }


        }

        return null;
    }

}