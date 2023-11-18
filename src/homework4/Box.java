package homework4;
    //        Создайте обобщенный класс Box, который будет представлять собой коробку, способную хранить объекты разных типов.
    //        Класс Box должен иметь поле для хранения объекта и соответствующие геттеры и сеттеры.
public class Box< T > {
    T Box;   // параметр, используем generic(обобщение)

    public Box(T box) {   //конструктор
        Box = box;
    }

    public T getBox() {     //геттер и сеттер
        return Box;
    }

    public void setObj(T box) {
        Box = box;
    }
    //        Создайте метод printBoxContents, который принимает объект класса Box и выводит на экран содержимое этой коробки.
    //        Обратите внимание, что этот метод должен работать с любым типом объекта, хранящегося в Box.
    //        Используйте обобщенные методы для достижения этой цели.
    public static <T> void printBoxContents(Box<?> box){
        System.out.println("Inside this box is " + box.getBox() + " which is " + box.getBox().getClass());
    }
}
