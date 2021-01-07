/*
Вводятся два целых числа. Проверить делится ли первое на второе.
Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае).

Если первое число нацело делится на второе, то вывести сообщение об этом.
Иначе вывести сообщение о том, что первое число не делится на второе, найти остаток от деления и также вывести его.
В конце программы найти частное от деления чисел и вывести его.
 */
package home_work_2;

import java.util.Scanner;

public class DZ2_2_divisibility_check {
    public static void main(String[] args) {
        int a,b;
        Scanner keys = new Scanner(System.in);
        System.out.println("Введи последовательно 2 разных ЦЕЛЫХ числа, которые будут проверяться на делимость");
        a = keys.nextInt();
        System.out.println("Вы ввели число " + a + ", введите еще 1 число");
        b = keys.nextInt();
        System.out.println("Вы ввели число " + b + ", больше ввод не требуется");

        System.out.println("Думаем и считаем, не то что тупаки из омона...");

        System.out.println(divisibilityCheck(a,b));
    }

    public static String divisibilityCheck (int a, int b){
        int check = 0;
        String S;
        if (a == b){
            S = "Ты ввел 2 одинаковых числа, перезапусти программу и не пытайся обмануть как пересидент!";
        } else if (b == 0) {
            S = "Красаучыг, второе число не может быть 0, очевидно же.";
        } else if(a % b == 0) {
            check = (int)(a / b);
            S = "Первое число делится без остатка на второе. Результат = " + check;
        } /* else if(b % a == 0) {
            check = (int)(b / a);
            S = "Второе число делится без остатка на первое. Результат = " + check;
        } */ else {
            check = (int)(a / b);
            S = "Первое число не делятся без остатка на второе. Результат деления = " + check +
            " Остаток от деления = " + a % b;
        }

        return S;
    }
}
