package homework3;

public class StudyGroup {    //класс StudyGroup, с конструктором и геттером/сеттером
    String name;  //название группы
    Integer size;  //кол-во людей

    public StudyGroup(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
