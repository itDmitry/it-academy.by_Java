/*
1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
В конце в консоль вывести сообщение со значением до переполнения и после переполнения.
Умножать на:
1.4.1. 3
1.4.2. 188
1.4.3. -19
1.4.4. Да и вообще на любое целочисленное
*/
package home_work_2;

import java.util.Scanner;

public class DZ2_1_4 {
    public static void main(String[] args) {
        long a = 1;

        while (a < Long.MAX_VALUE){
            if (a > Long.MAX_VALUE / 3){
                System.out.println("\nПри умножении на 3 при следующей итерации произойдет переполнение переменной.\n" +
                        "Крайнее значение переменной a = " + a + ", после переполнения будет равно " + a*3);
                break;
            }
            a = a*3;
        }

        a = 1;

        while (a < Long.MAX_VALUE){
            if (a > Long.MAX_VALUE / 188){
                System.out.println("\nПри умножении на 188 при следующей итерации произойдет переполнение переменной.\n" +
                        "Крайнее значение переменной a = " + a + ", после переполнения будет равно " + a*188);
                break;
            }
            a = a*188;
        }

        a = 1;

        while (Math.abs(a) < Long.MAX_VALUE) {
            if (Math.abs(a) > Long.MAX_VALUE / 19) {
                System.out.println("\nПри умножении на -19 при следующей итерации произойдет переполнение переменной.\n" +
                        "Крайнее значение переменной a = " + a + ", после переполнения будет равно " + a * -19);
                break;
            }
            a = a * -19;
        }

        a = 1;
        int b;

        Scanner console = new Scanner(System.in);
        System.out.println("\nТеперь введите число для цикла умножения.");
        b = console.nextInt();
        console.close();

        while (Math.abs(a) < Long.MAX_VALUE) {
            if (Math.abs(a) > Long.MAX_VALUE / b) {
                System.out.println("\nПри умножении на " + b +
                        " при следующей итерации произойдет переполнение переменной.\n" +
                        "Крайнее значение переменной a = " + a + ", после переполнения будет равно " + a * b);
                break;
            }
            a = a * b;
        }
    }

    public static
}
