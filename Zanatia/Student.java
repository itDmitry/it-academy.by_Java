package Zanatia;

public class Student {
    private final int serialNumber;
    private final String name;
    private final int age;
    private final double rating;
    private final boolean participation;

    public Student (int serialNumber, String name, int age, double rating, boolean participation){
        this.serialNumber = serialNumber;
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.participation = participation;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getRating() {
        return rating;
    }

    public boolean isParticipation() {
        return participation;
    }
}
