package home_work_5.predicate;

import home_work_5.dto.Student;

import java.util.function.Predicate;

public class StudentAgeAndScorePredicate implements Predicate<Student> {
    private int age;
    private double rating;

    public StudentAgeAndScorePredicate(int age, double rating){
        this.age = age;
        this.rating = rating;
    }

    @Override
    public boolean test(Student student) {
        return student.getAge() >= age && student.getRating() >= rating;
    }
}
