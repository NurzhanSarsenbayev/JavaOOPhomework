package homework4;
//        Создайте еще один обобщенный класс Pair, который будет представлять собой пару объектов.
//        Этот класс должен иметь два поля для хранения объектов и соответствующие геттеры и сеттеры.
public class Pair <T , V > {
    T FirstPair;    // первый параметр, оба generic
    V SecondPair;   // второй параметр

    public T getFirstPair() {    //  геттеры/сеттеры для обоих параметров
        return FirstPair;
    }

    public void setFirstPair(T firstPair) {
        this.FirstPair = firstPair;
    }

    public void setFirstPairToSecond(Object firstPair) {
        this.FirstPair = (T) firstPair;
    }    //сеттер специально для метода Свап. Использовал object что бы обойти проблему с строгой типизацией аргументов

    public V getSecondPair() {
        return SecondPair;
    }

    public void setSecondPair(V secondPair) {
        this.SecondPair = secondPair;
    }

    public void setSecondPairToFirst(Object secondPair) {
        this.SecondPair = (V) secondPair;
    }    //сеттер специально для метода Свап номер 2. Использовал object что бы обойти проблему с строгой типизацией аргументов

    public Pair(T firstPair, V secondPair) {   // конструктор для Pair
        FirstPair = firstPair;
        SecondPair = secondPair;
    }

//        Создайте метод swapPairs, который принимает массив объектов типа Pair и меняет местами элементы в каждой паре.
//        Например, если у вас есть пара (A, B), после вызова swapPairs она должна стать парой (B, A).
//        Используйте обобщенные методы для реализации этой операции
    public static <T,V> void swapPairs(Pair<?, ?>[] pairs) {
        for (Pair<?, ?> pair : pairs) {
            Object tempFirst = pair.getFirstPair();
            Object tempSecond = pair.getSecondPair();
            pair.setFirstPairToSecond(tempSecond);
            pair.setSecondPairToFirst(tempFirst);              //Вот тут пришлось попариться. В итоге обыграл с классом Object, а то никак не
        }                                                      //хотел метод работать. Незнаю на сколько корректно, но задачу свою выполняет.
    }
}


