package Zanatia.Comporators;

import Zanatia.dto.Student;

import java.util.Comparator;

public class StudentNameComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

/*    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2.);
    }*/

}