package Zanatia.predicate;

import Zanatia.dto.Student;

import java.util.function.Predicate;

public class StudentAgeAndScorePredicate implements Predicate<Student> {
    private int age;
    private double rating;

    @Override
    public boolean test(Student student) {
        return student.getAge() >= 12 && student.getRating() >=8;
    }
}
