/*
1.3. Возведение в степень. Через консоль пользователь вводит два числа.
Первое число это число которое мы будем возводить, Второе число это степень в которую возводят первое число.
Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
Math использовать нельзя.
1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
*/
package home_work_2;

import java.util.Scanner;

public class DZ2_1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи последовательно 2 числа и честный ЦИК возведет первое в степень, равную второму." +
                "\nПервое число может быть дробным, второе должно быть целым");

        double a = console.nextDouble();
        System.out.println("Вы ввели число " + a + ", введите еще 1 целое число");
        int b = console.nextInt();
        System.out.println("Вы ввели число " + b + ", ввод окончен");

        console.close();

        System.out.println("\nЧисло " + a + " в степени " + b + " равно " + exponentation(a,b));
    }

    public static double exponentation(double argument, int stepen){
            double result = 1;
        for (int i = 0; i < stepen; i++) {
            result *= argument;
            if (result > Double.MAX_VALUE / (i+1)){
                System.out.println("На следующей итерации произойдет переполнение переменной result типа double. " +
                        "Максимальная степень для аргумента " + argument + " равна " + i);
            }
        }

        return result;
    }
}
