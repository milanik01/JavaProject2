package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


            Product product1 = new Product();
            // product1.name = "product1";
            // product1.brand = "brand1";
            // product1.price = 100.0;
            // System.out.println(product1.displayInfo());

            Product product2 = new Product("product2", "brand2", 200.0);
            // System.out.println(product2.displayInfo());

            // product2.setPrice(-100);

            Product product3 =  new Product("Product3");
            // System.out.println(product3.displayInfo());

            BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Бутылка воды 1","ООО Молоко", 350, 1000, 15);
            //System.out.println(bottleOfMilk1.displayInfo());

            BottleOfWater bottleOfWater1 = new BottleOfWater("Бутылка с водой", "ООО Источник", 350, 1.0);
            BottleOfWater bottleOfWater2 = new BottleOfWater("Бутылка с водой", "ООО Источник", 150, 1.5);
            BottleOfWater bottleOfWater3 = new BottleOfWater("Бутылка с водой", "ООО Источник", 250, 2.5);
            Chocolate chocolate1 = new Chocolate("Аленка", "Ротфронт", 150, 100);
            Chocolate chocolate2 = new Chocolate("Milka", "Милка", 200, 80);
            Chocolate chocolate3 = new Chocolate("Lindt", "Линдт", 250, 100);

            List<Product> products = new ArrayList<>();
            products.add(bottleOfMilk1);
            products.add(bottleOfWater1);
            products.add(bottleOfWater2);
            products.add(bottleOfWater3);
            products.add(chocolate1);
            products.add(chocolate2);
            products.add(chocolate3);

            VendingMachine vendingMachine = new VendingMachine(products);

            BottleOfWater bootleOfWater = vendingMachine.getBottleOfWater("Бутылка с водой", 1.5);

            if(bootleOfWater!=null){
                System.out.println("Вы получили: ");
                System.out.println(bootleOfWater.displayInfo());
            }

            else{
                System.out.println("Такой бутылки с водой в автомате нет");
            }

            Chocolate chokolate = vendingMachine.getChocolate("Milka", 80);

            if(chokolate!=null){
                System.out.println("Вы получили: ");
                System.out.println(chokolate.displayInfo());
            }

            else{
                System.out.println("Такой бутылки с водой в автомате нет");
            }


        }



    }
