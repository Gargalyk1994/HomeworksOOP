package Homework1;

public class HotDrink {
    protected String name;
    protected double volume;

    public HotDrink(){
        this("name",0.5);
    }

    public HotDrink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String displayInfo(){
        return String.format("%s, %.1f", name, volume);
    }
}
