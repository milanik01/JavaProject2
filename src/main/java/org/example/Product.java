package org.example;



import org.w3c.dom.ranges.RangeException;

public class Product {


    protected String name;//Наименование
    protected String brand;//Изготовитель
    protected double price;//Стоимость

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){

        if(price<100.0){
            throw new RuntimeException("Неверная цена");
        }
        else{
            this.price = price;
        }
    }

    public String getBrand(){
        return brand;
    }

    public Product(){
        this("Noname");

    }
    public Product(String name){
        this(name, "Noname");

    }
    public Product(String name, String brand){
        this(name, brand, 100.0);

    }

    public Product(String name, String brand, double price){



        checkName(name);
        checkPrice(price);
        checkBrand(brand);


    }

    public String displayInfo(){
        return String.format("%s -  %s - %2f", name, brand, price);
    }


    private void checkName(String name){
        if(name == null || name.length()<3){
            this.name = "Noname";
        }
        else{
            this.name = name;
        }

    }

    private void checkBrand(String brand){
        if(brand == null || brand.length()<3){
            this.brand = "Noname";
        }
        else{
            this.brand = brand;
        }
    }

    private void checkPrice(double price){
        if(price<100){
            this.price = 100.0;
        }
        else{
            this.price = price;
        }
    }
}
