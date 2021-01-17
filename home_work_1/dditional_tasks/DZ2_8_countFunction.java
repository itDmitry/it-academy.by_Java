/*
Вычислить значение функции y=f(x)

Дана следующая функция y=f(x):
y = 2x - 10, если x > 0
y = 0, если x = 0
y = 2 * |x| - 1, если x < 0

Требуется найти значение функции по переданному x.

Получить с клавиатуры значение x.
Если x больше 0, то вычислить выражение 2*x-10, результат присвоить переменной y.
Иначе если x равен 0, то присвоить y значение 0.
Иначе присвоить y результат выражения 2*|x|-1.
Вывести значение y на экран.
 */
package home_work_1.dditional_tasks;

import java.util.Scanner;

public class DZ2_8_countFunction {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        double x, y;

        System.out.println("Введи переменную \"x\" для вычисления функции");
        x = keys.nextDouble();
        System.out.println("Перемення x равна " + x + ", начинаю вычисления.");

        keys.close();

        if (x > 0){
            y = 2*x - 10;
        } else if (x < 0){
            y = 2*Math.abs(x) - 1;
        } else {
            y = 0;
        }

        System.out.println("\nЗначение y равно " + y);
    }
}
