package org.example;

public class BottleOfWater extends Product  {
    double volume;

    public BottleOfWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        this.volume = volume;

    }



    public double getVolume(){
        return volume;
    }

    @Override
    public String displayInfo(){
        return String.format("[Бутылка с водой] %s -  %s - %2f V: %2f", name, brand, price, volume);
    }
}
