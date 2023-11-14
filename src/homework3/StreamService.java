package homework3;


import java.util.List;

//        — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
public class StreamService{
    public List<Stream> sortStream(List<Stream> streams){
        streams.sort(new StreamComparator());
        return streams;
    }
}
