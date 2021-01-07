/*
Среди трех чисел найти среднее

Вводятся три разных числа. Найти, какое из них является средним (больше одного, но меньше другого).

Проверить, лежит ли первое число между двумя другими. При этом может быть два случая:

первое больше второго и первое меньше третьего,
первое меньше второго и первое больше третьего.
Если ни один из вариантов не вернул истину, значит первое число не среднее. Тогда проверяется, не лежит ли второе число между двумя другими. Это может быть в двух случаях, когда

второе больше первого и меньше третьего,
второе меньше первого и больше третьего.
Если эти варианты также не вернули истину, то остается только один вариант - посередине лежит третье число.
*/package home_work_2;

import java.util.Scanner;

public class DZ2_1_findMiddleOne {
    public static void main(String[] args) {
        double a,b,c;
        Scanner keys = new Scanner(System.in);
        System.out.println("Введи последовательно 3 числа из которых будет найдено среднее");
        a = keys.nextDouble();
        System.out.println("Вы ввели число " + a + ", введите еще 2 числа");
        b = keys.nextDouble();
        System.out.println("Вы ввели число " + b + ", введите еще 1 число");
        c = keys.nextDouble();
        System.out.println("Вы ввели число " + c + ", больше ввод не требуется");

        System.out.println("Думаем и считаем, не то что тупаки из омона...");
        System.out.println("Среднее из введенных чисел " + findMiddleOne(a,b,c));

    }

    public static double findMiddleOne(double a, double b, double c){
        double middle;

        if ((a == b) || (a == c) || (b == c)){
            System.out.println("Есть повторяющиеся числа! Перезапусти программу и не будь тупым омоновцем!");
            middle = 0;
        }
        else {
            if ((a < b && a > c)||(a > b && a < c)){
                middle = a;
            } else if ((b < a && b > c)||(b > a && b < c)){
                middle = b;
            } else {
                middle = c;
            }
        }

        return middle;
    }
}
