package home_work_1;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class DZ1_5_If {
    public static void main(String[] args) {

/*5. Разбираемся с операторами ветвления.
Используя статью https://metanit.com/java/tutorial/2.9.php запросить у пользователя его имя.
В данном задании у вас должно получиться 3 класса.


5.1 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if

Что в итоге надо сделать (общее условие):
1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке,
 а на второй "Я тебя так долго ждал".
2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".

ВНИМАНИЕ! В примерах if и else if для сравнения имён использовать код вида Objects.equals("Имя1", "Имя2"). */

        Scanner keys = new Scanner(System.in);
        System.out.println("Введите ваше имя, пожалуйста, а то вызову омон, а они там все отбитые наглухо!");
        String name = keys.nextLine();


        if (Objects.equals(name, "Вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }

        if (Objects.equals(name, "Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }

        if (!(Objects.equals(name, "Вася") || Objects.equals(name, "Анастасия"))) {
            System.out.println("Добрый день, а вы кто?");
        }

    }
}
