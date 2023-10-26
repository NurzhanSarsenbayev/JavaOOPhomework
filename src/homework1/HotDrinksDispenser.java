package homework1;

import homework1.Dispenser;

public class HotDrinksDispenser implements Dispenser {

    public int volume;
    public String name;


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public HotDrinksDispenser() {

    }

    public HotDrinksDispenser(String name, int volume, int temperature) {

    }

    public void orderInfo() {
    }

    @Override
    public void getProduct() {

    }

    protected void setTemperature(int nextInt) {
    }
}


