package homework3;

import java.util.ArrayList;
import java.util.List;

//— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//        — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//        — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
//        — Модифицировать класс Контроллер, добавив в него созданный сервис;
//        — Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
//
//        Формат сдачи: ссылка на гитхаб проект
public class Main {
    public static void main(String[] args){

        StudyGroup studyGroup1 = new StudyGroup("Group 1",1);
        StudyGroup studyGroup2 = new StudyGroup("Group 2",2);
        StudyGroup studyGroup3 = new StudyGroup("Group 3",2);
        StudyGroup studyGroup4 = new StudyGroup("Group 4",4);
        StudyGroup studyGroup5 = new StudyGroup("Group 5",6);
        StudyGroup studyGroup6 = new StudyGroup("Group 6",10);

        Stream stream1 = new Stream();
        Stream stream2 = new Stream();
        stream1.add(studyGroup1);
        stream2.add(studyGroup2);
        stream1.add(studyGroup3);
        stream2.add(studyGroup4);
        stream2.add(studyGroup5);
        stream1.add(studyGroup6);

        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);



        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1);
        streamList.add(stream2);
        controller.sortStream(streamList);

        streamService.sortStream(streamList);

        for (Stream streams:streamList) {
            System.out.println("Stream: ");
            for (StudyGroup group:streams) {
                System.out.println("-" + group.getName() + " size is "+ group.getSize());
            }
        }

    }
}
