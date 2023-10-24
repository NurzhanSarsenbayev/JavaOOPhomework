//        Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
//        getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
//        заложенную в программе
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
public class Main {
    public static void main(String[] args) {


        HotDrinks tea1 = new Tea(5, "GreenTea",15 );
        HotDrinks tea2 = new Tea(3,"Black Tea", 10);

        HotDrinksDispenser[] machine1 = new HotDrinksDispenser[2];
        machine1[0] = tea1;
        machine1[1]= tea2;
        machine1[0].getProduct();
        machine1[1].getProduct();


    }
}