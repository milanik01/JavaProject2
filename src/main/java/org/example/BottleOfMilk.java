package org.example;

public class BottleOfMilk extends Product {

    private double volume; //объем
    private int fat; //содержание жирности


    public BottleOfMilk(String name, String brand, double price, double volume, int fat){
        super(name, brand, price);
        this.fat = fat;
        this.volume = volume;

    }

    public double getVolume(){
        return volume;
    }
    @Override
    public String displayInfo(){
        return String.format("[Бутылка с водой] %s -  %s - %2f V: %2f Fat: %d", name, brand, price, volume, fat);
    }
}
