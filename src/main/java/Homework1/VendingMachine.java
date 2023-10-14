package Homework1;

import java.util.List;

public class VendingMachine {
    private List<HotDrink> hotDrinks;

    public VendingMachine(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public HotCoffee getHotCoffee(String name, double volume, int price){
        for (HotDrink hotDrink: hotDrinks) {
            if(hotDrink instanceof HotCoffee){
                HotCoffee americano = (HotCoffee) hotDrink;
                if(americano.getName().equals(name) && americano.getVolume() == volume && americano.getPrice() == price ){
                    return americano;
                }

            }
        }
        return null;
    }

    public HotTea getHotTea(String name, double volume, int price){
        for (HotDrink hotDrink: hotDrinks) {
            if(hotDrink instanceof HotTea){
                HotTea hotTea = (HotTea) hotDrink;
                if(hotTea.getName().equals(name) && hotTea.getVolume() == volume && hotTea.getPrice() == price ){
                    return hotTea;
                }

            }
        }
        return null;
    }
}
