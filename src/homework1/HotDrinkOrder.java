package homework1;

public class HotDrinkOrder extends HotDrinks {
    private int temperature;


    public HotDrinkOrder() {
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void getProduct() {

        System.out.println("What kind of drink you want? There is Tea, Coffee and Water");
        HotDrinks orderDrink = new HotDrinkOrder();
        orderDrink.setName(Dispenser.sc.nextLine());
        System.out.println("What kind of volume you want?");
        orderDrink.setVolume(Dispenser.sc.nextInt());
        System.out.println("What kind of temperature you want?");
        orderDrink.setTemperature(Dispenser.sc.nextInt());
        orderDrink.orderInfo();

    }
    @Override
    public void orderInfo() {
        System.out.println("Name :" + getName());
        System.out.println("Volume :" + getVolume());
        System.out.println("Temperature: " + getTemperature());
    }
}
