package homework3;

import java.util.List;

//        — Модифицировать класс Контроллер, добавив в него созданный сервис;
//        — Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
public class Controller{
    StreamService streamService;   // добавленный сервис и конструктор.
    public Controller(StreamService streamService){
        this.streamService = streamService;
    }
    List<Stream> sortStream(List<Stream> streams) {   // метод сортировки
        streams.sort(new StreamComparator());
        return streams;
    }
}
