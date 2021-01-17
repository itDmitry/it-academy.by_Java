/*
Вводятся два целых числа. Проверить делится ли первое на второе.
Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае).

Если первое число нацело делится на второе, то вывести сообщение об этом.
Иначе вывести сообщение о том, что первое число не делится на второе, найти остаток от деления и также вывести его.
В конце программы найти частное от деления чисел и вывести его.
 */
package home_work_1.dditional_tasks;

import java.util.Scanner;

public class DZ2_2_divisibilityCheck {
    public static void main(String[] args) {
        int a,b;
        Scanner keys = new Scanner(System.in);
        System.out.println("Введи 2 разных ЦЕЛЫХ числа, которые будут проверяться на делимость первого на второе.");
        a = keys.nextInt();
        System.out.println("Вы ввели число " + a + ", введите еще 1 число");
        b = keys.nextInt();
        System.out.println("Вы ввели число " + b + ", больше ввод не требуется");

        keys.close();

        System.out.println("Думаем и считаем, не то что тупаки из омона...");
        System.out.println(divisibilityCheck(a,b));
        if (b != 0){
            System.out.println("Частное от деления = " + a / b);
        }
    }

    public static String divisibilityCheck (int a, int b){
        String s;

        if (b == 0) {
            s = "Красаучыг, второе число не может быть 0, очевидно же. Перевыборы!.. Т.е. перезапуск делай...";
        } else if(a % b == 0) {
            s = "Первое число делится без остатка на второе.";
        } else {
            s = "Первое число не делятся без остатка на второе. Остаток от деления = " + a % b;
        }

        return s;
    }
}
