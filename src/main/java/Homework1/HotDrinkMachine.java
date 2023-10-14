package Homework1;

import java.util.ArrayList;

public class HotDrinkMachine {
    public static void main(String[] args) {
        HotDrink hotCoffee = new HotCoffee("Americano", 0.6, 90, 100);
        HotDrink hotTea= new HotTea("Fruit tea", 0.5,90, 60);
        HotDrink hotTea2= new HotTea("Lipton", 0.33,80, 60);
        HotDrink hotTea3= new HotTea("GreenField", 0.5,80, 70);
        HotDrink hotCoffee2= new HotCoffee("Cappuccino", 0.33,80, 120);
        HotDrink hotCoffee3= new HotCoffee("Amaretto", 0.33,90, 110);


        ArrayList<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(hotCoffee);
        hotDrinks.add(hotTea);

        VendingMachine vendingMachine = new VendingMachine(hotDrinks);
        HotTea choiceHotTea = vendingMachine.getHotTea("Lipton", 0.33, 50);
        if(hotTea == null){
            System.out.println("No this drink");
        } else {
            System.out.println(hotTea.displayInfo());
        }
    }
}
