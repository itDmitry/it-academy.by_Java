/*
Какой координатной четверти принадлежит точка?

Определить четверть координатной плоскости, которой принадлежит точка. Координаты точки ввести с клавиатуры.

Если у точки обе координаты (x и y) положительны, то она принадлежит первой четверти.
Если координата x отрицательна, а y положительна, то точка находится во второй четверти.
Если обе координаты отрицательны, то точка принадлежит третьей координатной четверти.
Если x положительна, а y отрицательна, то точка находится в IV четверти.

Следует иметь в виду, что использовать в программе четыре отдельные инструкции if не совсем правильно.
Хотя такое решение даст верный результат, программу нельзя будет назвать эффективной,
т.к. даже если первая проверка дала "правду", дальнейшие проверки будут продолжены, хотя в них нет никакого смысла.
Поэтому правильным решением будет использование вложенных конструкций if-else.
Это замечание не касается языка Python, т.к. в нем есть конструкция множественного ветвления (if-elif-else).

Поскольку точка может лежать на одной из двух координатных осей или находиться в начале координат,
то значит могут быть ситуации, когда точка не принадлежит ни одной из четвертей.
Эти случаи обрабатываются в отдельных ветках, либо опускаются.
Из этого также следует, что если первые три проверки не сработали, то нельзя делать однозначный вывод,
что точка принадлежит оставшейся четверти. Поэтому в программе сообщение о том,
в какой четверти находится точка может быть только в теле if, но не else.
*/
package home_work_1.dditional_tasks;

import java.util.Scanner;

public class DZ2_6_whichCoordinateQuarter {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        double x, y;

        System.out.println("Введи координаты x и y для точки и ЦИК скажет, в какой четверти она находится.");
        x = keys.nextDouble();
        System.out.println("Координата x равна " + x + ", введите координату y.");
        y = keys.nextDouble();
        System.out.println("Координата y равна " + y + ", ввод завершен.");

        keys.close();

        System.out.println("Точка находится " + whichCoordinateQuarter(x,y) + ".");
    }

    public static String whichCoordinateQuarter(double x, double y){
        String s;

        if (x > 0){
            if (y > 0){
                s = "в первой координатной четверти";
            } else if (y < 0){
                s = "в четвертой координатной четверти";
            } else {
                s = "в правой половине координат";
            }
        } else if (x < 0){
            if (y > 0){
                s = "во второй координатной четверти";
            } else if (y < 0){
                s = "в третьей координатной четверти";
            } else {
                s = "в левой половине координат";
            }
        } else {
            if (y > 0){
                s = "в верхней половине координат";
            } else if (y < 0){
                s = "в нижней половине координат";
            } else {
                s = "в начале координат";
            }
        }

        return s;
    }
}
