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
package Zanatia;

import Zanatia.Comporators.StudentNameComporator;
import Zanatia.dto.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<>(10000);

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            listOfStudents.add(new Student(i+1, randomNameGenerator(),
                    (int) (7 + Math.random()*(17 - 7 + 1)), random.nextDouble()*10,
                    random.nextBoolean()));
        }

        ArrayList<Student> filteredStudents = new ArrayList<>();
        filteredStudents = filterByAgeAndRating(listOfStudents);

        StudentNameComporator comporator = new StudentNameComporator();
        sortWithComporatorBubble(filteredStudents, comporator);

        for (int i = 0; i < 10; i++) {
            printStudent(filteredStudents.get(i));
        }
    }

    public static ArrayList<Student> filterByAgeAndRating (ArrayList<Student> arrayList){

        ArrayList<Student> filteredStudentsList = new ArrayList<>();

        for (Student student : arrayList) {
            if (student.getAge() >= 12 && student.getRating() >= 8) {
                filteredStudentsList.add(student);
            }
        }
        return filteredStudentsList;
    }

    public static <T> void sortWithComporatorBubble(List<T> container, Comparator<T> comparator) {
        int dlinacontainera = container.size();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (dlinacontainera - 1); i++) {
                T first = container.get(i);
                T second = container.get(i+1);
                int compare = comparator.compare(container.get(i), container.get(i+1));
                if (compare > 0 ) {
                   container.set(i, second);
                   container.set(i+1, first);
                   isSorted = false;
                }
                if (isSorted) {
                    break;
                }
            }
        }
    }

    public static <T> void sortWithComporatorShaker(List<T> container, Comparator<T> comparator) {
        int dlinacontainera = container.size();
        int leftBorder = 0;
        int rightBorder = dlinacontainera - 1;
        boolean isSorted;
        while (leftBorder < rightBorder) {
            isSorted = true;
            for (int i = leftBorder; i < rightBorder; i++) {
                T first = container.get(i);
                T second = container.get(i+1);
                int compare = comparator.compare(container.get(i), container.get(i+1));
                if (compare > 0) {
                    container.set(i, second);
                    container.set(i+1, first);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            rightBorder--;
            for (int i = rightBorder; i > leftBorder; i--) {
                T first = container.get(i-1);
                T second = container.get(i);
                int compare = comparator.compare(container.get(i-1), container.get(i));
                if (compare > 0) {
                    container.set(i-1, second);
                    container.set(i, first);
                    isSorted = false;
                }
            }
            leftBorder++;
            if (isSorted) {
                break;
            }
        }
    }



    public static String randomNameGenerator() {
        StringBuilder builder = new StringBuilder();
            int length = (int) (Math.random()*10);
            for(int i = 0; i < length; i++) {
                builder.append((char)(Math.random()*26 + 'a'));;
            }
        return builder.toString();
        }

    public static void printStudent(Student student){
        System.out.println("№: " + student.getSerialNumber());
        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст: " + student.getAge());
        System.out.println("Средний балл: " + student.getRating());
        System.out.println("Олимпиадник?: " + student.isParticipant() + "\n");
    }
}