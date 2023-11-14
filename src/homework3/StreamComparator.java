package homework3;

import java.util.Comparator;

//        — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
public class StreamComparator implements Comparator<Stream>{  // инициализация интерфейса

    @Override
    public int compare(Stream s1, Stream s2) {      // метод для сравнения Групп

        int studyGroupSize1 = s1.getStream().size();
        int studyGroupSize2 = s2.getStream().size();

        return Integer.compare(studyGroupSize1,studyGroupSize2);
    }
}

