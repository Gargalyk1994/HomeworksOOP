package Homework1;

public class HotCoffee extends HotDrink{
    private int temperature;
    private double price;

    public HotCoffee(String name, double volume, int temperature, double price){
        super(name, volume);
        checkTemperature(temperature);
        checkPrice(price);

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void checkPrice(double price){
        if(price < 60) {
            this.price = 60;
        }else {
            this.price = price;
        }
    } public void checkTemperature(int temperature){
        if(temperature < 50) {
            this.temperature = 50;
        }else {
            this.temperature = temperature;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("Take your drink - coffee: %s, volume: %.1f, temperature: %s, price: %s"
                , name, volume, temperature, price);
    }
}
