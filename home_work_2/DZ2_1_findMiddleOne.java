package home_work_2;

import java.util.Scanner;

public class DZ2_1_findMiddleOne {
    public static void main(String[] args) {
        double a,b,c;
        Scanner keys = new Scanner(System.in);
        System.out.println("Введи последовательно 3 числа из которых будет найдено среднее");
        a = keys.nextInt();
        System.out.println("Вы ввели число " + a + ", введите еще 2 числа");
        b = keys.nextInt();
        System.out.println("Вы ввели число " + b + ", введите еще 1 число");
        c = keys.nextInt();
        System.out.println("Вы ввели число " + c + ", больше ввод не требуется");

        System.out.println("Думаем и считаем, не то что тупаки из омона...");
        System.out.println("Среднее из введенных чисел " + findMiddleOne(a,b,c));

    }

    public static double findMiddleOne(double a, double b, double c){
        double middle;

        if ((a <= b && a >= c)||(a >= b && a <= c)){
            middle = a;
        } else if ((b <= a && b >= c)||(b >= a && b <= c)){
            middle = b;
        } else {
            middle = c;
        }

        return middle;
    }
}
