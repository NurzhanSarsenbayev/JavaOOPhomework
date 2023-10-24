public class HotDrinksDispenser implements Dispenser  {

    private int volume;
    private String name;

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
    public HotDrinksDispenser(int volume, String name) {
        this.name = name;
        this.volume = volume;
    }

    public HotDrinksDispenser(String name, int volume, int temperature) {

    }

    @Override
    public void getProduct() {


        System.out.println("Name :" + this.getName());
        System.out.println("Volume :" + this.getVolume());

    }
}
