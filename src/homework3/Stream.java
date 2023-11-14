package homework3;
//Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stream implements Iterable<StudyGroup>{    // реализация интерфейса

    List<StudyGroup> Stream; //список, а так же его геттер/сеттер

    public Stream() {
        Stream = new ArrayList<>();
    }

    public List<StudyGroup> getStream() {

        return Stream;
    }

    public void setStream(List<StudyGroup> Stream) {

        this.Stream = Stream;
    }
    public List<StudyGroup> add(StudyGroup studyGroup){
        Stream.add(studyGroup);
        return Stream;
    }
    @Override
    public Iterator<StudyGroup> iterator() {
        return Stream.iterator();
    }
}
