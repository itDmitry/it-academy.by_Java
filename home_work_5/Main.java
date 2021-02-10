/*
1. Создать класс Student с полями порядковый номер (int),
имя (Строка размером от 3 до 10 русских символов),
возраст (7-17),
оценка(0.0-10.0),
признак участия в олимпиадах (bool).
2. Создать 10_000 объектов класс Student и поместить в коллекцию.
Данные заполняются рандомно. Стандартного рандома для строк нету.
3. Отфильтровать студентов по нескольким признакам.
По возрасту (тем кому 12 и выше), по оценке (выше 8).
Отфильтрованных студентов поместить в отдельный список.
Старый список дожен остаться неизменным.
4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно.
Вывести топ 10 в каждом возрасте.
* */
package home_work_5;

import Zanatia.Comparators.StudentNameComparator;
import home_work_5.Utils.SortUtils;
import Zanatia.core.Random.api.iRandom;
import home_work_5.dto.Student;
import home_work_5.predicate.StudentAgeAndScorePredicate;
import home_work_5.suppliers.RandomStudentSupplier;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<>(10000);

        iRandom random = new Java8RandomNamesFromFile();
        AtomicInteger counter = new AtomicInteger(0);
        RandomStudentSupplier randomStudentSupplier = new RandomStudentSupplier(random, counter);
        for (int i = 0; i < 10000; i++) {
            listOfStudents.add(randomStudentSupplier.get());
        }

        StudentAgeAndScorePredicate studentAgeAndScorePredicate =
                new StudentAgeAndScorePredicate(12,8);
        ArrayList<Student> filteredStudents =
                filterByAgeAndRating(listOfStudents, studentAgeAndScorePredicate);

        StudentNameComparator comparator = new StudentNameComparator();
        SortUtils.sortWithComporatorBubble(filteredStudents, comparator);

        Iterator<Student> iteratorStudentov = filteredStudents.iterator();

        for (int i = 0; i < 10; i++) {
            printStudent(iteratorStudentov.next());
        }
    }

    public static ArrayList<Student> filterByAgeAndRating (ArrayList<Student> arrayList,
                                                           Predicate<Student> predicate){

        ArrayList<Student> filteredStudentsList = new ArrayList<>();

        for (Student student : arrayList) {
            if (predicate.test(student)) {
                filteredStudentsList.add(student);
            }
        }
        return filteredStudentsList;
    }

    public static void printStudent(Student student){
        System.out.println("№: " + student.getSerialNumber());
        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний балл: " + student.getRating());
        System.out.println("Олимпиадник?: " + student.isParticipant() + "\n");
    }
}