package homework1;

//        Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
//        getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
//        заложенную в программе
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
public class Main {
    public static void main(String[] args) {

        HotDrinksDispenser machine1 = new HotDrinksDispenser();
        HotDrinks order1 = new HotDrinkOrder();
        order1.getProduct();


    }
}
//    Код можно дополнить комментариями, объясняющими цель и назначение каждого класса и метода. Это поможет другим разработчикам и студентам лучше понимать ваш код.

//        Рассмотрите возможность добавления геттеров и сеттеров для полей в классе homework1.HotDrinksDispenser,
//        чтобы обеспечить инкапсуляцию данных.
//
//        В методах getProduct() классов homework1.HotDrinks и homework1.HotDrinksDispenser можно добавить вывод информации
//        о типе горячего напитка (через вызов super.getName()) для улучшения информативности вывода.
//
//        Попробуйте учесть принципы SOLID, особенно Single Responsibility Principle (SRP),
//        чтобы классы выполняли только одну задачу. Возможно, вы захотите выделить классы,
//        отвечающие за хранение данных (например, homework1.HotDrinks и homework1.HotDrinksDispenser), от классов,
//        отвечающих за вывод информации на экран или обработку заказов.
//
//        Предоставьте пример реализации класса HotDrinksMachine, который будет отвечать за
//        обработку заказов на горячие напитки, основываясь на переданных параметрах (имя, объем, температура).
//
//        Обеспечьте возможность создания нескольких видов горячих напитков и их
//        различных вариантов (например, зеленый чай с температурой 15 градусов и черный чай с температурой 10 градусов).
//
//        В методе main() добавьте логику для заказа горячих напитков из автомата с
//        указанием параметров (имя, объем, температура) и вывода информации о заказанных напитках.
//
//        Рассмотрите возможность обработки ошибок, таких как неправильный заказ или
//        некорректные параметры, и предоставьте соответствующие сообщения об ошибках.