public class Tea extends HotDrinks{
    private int temperature;


    public Tea(int volume, String name, int temperature) {
        super(volume, name);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    @Override
    public void getProduct() {


        System.out.println("Name :" + this.getName());
        System.out.println("Volume :" + this.getVolume());
        System.out.println("Temp:" + this.getTemperature());

    }
}
