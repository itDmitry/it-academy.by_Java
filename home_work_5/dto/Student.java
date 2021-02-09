/*
1. Создать класс Student с полями порядковый номер (int),
имя (Строка размером от 3 до 10 русских символов),
возраст (7-17),
оценка(0.0-10.0),
признак участия в олимпиадах (bool).
*/
package home_work_5.dto;

public class Student implements Comparable<Student> {
    private final int serialNumber;
    private final String name;
    private final int age;
    private final double rating;
    private final boolean participant;

    public Student(int serialNumber, String name, int age, double rating, boolean participant) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.participant = participant;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getRating() {
        return this.rating;
    }

    public boolean isParticipant() {
        return this.participant;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}