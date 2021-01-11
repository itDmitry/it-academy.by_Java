/*
Решить квадратное уравнение
Найти корни квадратного уравнения и вывести их на экран, если они есть.
Если корней нет, то вывести сообщение об этом.
Конкретное квадратное уравнение определяется коэффициентами a, b, c, которые вводит пользователь.
Квадратное уравнение имеет вид ax2 + bx + c = 0.
Коэффициенты a, b и c - это конкретные числа, а x надо найти, решив уравнение.
Вычислить дискриминант по формуле d = b2 - 4ac.
Если дискриминант больше нуля, то вычислить два корня уравнения:
x1 = (-b+√d) / 2a
x2 = (-b-√d) / 2a
Если дискриминант равен нулю, то вычислить только один корень (второй будет равен ему).
Если дискриминант отрицателен, то вывести сообщение, что корней нет.
*/
package home_work_1;

import java.util.Scanner;

public class DZ2_5_quadraticEquation {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        double a, b, c, d;

        System.out.println("Введи коэффициенты \"a\", \"b\" и \"c\" в уравнение \"ax2 + bx + c = 0\" и все решим.");
        a = keys.nextDouble();
        System.out.println("Коэффициент а равен " + a + ", введите еще 2 числa.");
        b = keys.nextDouble();
        System.out.println("Коэффициент b равен " + b + ", введите еще 1 число.");
        c = keys.nextDouble();
        System.out.println("Коэффициент c равен " + c + ", ввод окончен.");

        keys.close();

        d = b*2 - 4*a*c;

        System.out.println(quadraticEquation(a,b,c,d));
    }

    public static String quadraticEquation(double a, double b, double c, double d){

        double x1, x2;
        String s;

        if (d > 0){
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            s = "Корни уравнения \"ax2 + bx + c = 0\" x1 = " + x1 + ", x2 = " + x2 +
                    ", потому что дискриминант положительный. d = " + d;
        } else if (d == 0){
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            s = "Корень уравнения \"ax2 + bx + c = 0\" x1 = x2 =" + x1 +
                    ", потому что дискриминант равен нулю. d = " + d;
        } else {
            s = "Корней уравнения \"ax2 + bx + c = 0\" нет, потому что дискриминант отрицательный. d = " + d;
        }

        return s;
    }
}
