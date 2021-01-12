/*
2.2 Перебор массива при помощи do....while, while, for, foreach.
Элементы массива вводить используя метод arrayFromConsole(). Все задачи в одном классе, в отдельных методах.
2.2.1 Вывести все элементы в консоль.
2.2.2 Вывести каждый второй элемент массива в консоль.
2.2.3 Вывести все элементы массива в консоль в обратном порядке.
*/
package home_work_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DZ2_2_2_UNF {
    public static void main(String[] args) {
        int[] array = arrayFromConsole();
        System.out.println("Получился массив " + Arrays.toString(array));

        doWhileFunction(array);
        whileFunction(array);
        forFunction(array);
        forEachFunction(array);
    }

    public static int[] arrayFromConsole(){
        Scanner console = new Scanner (System.in);
        System.out.println("Голосуйте за размер массива");

        int [] array = new int[console.nextInt()];

        System.out.println("Голосуйте за элементы массива");
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Голосуйте за элемент номер " + i + ", а если надоело, то напишите любую букву");
                array[i] = console.nextInt();
            } catch (java.util.InputMismatchException e){
                break;
            }
        }

        console.close();

        return array;
    }

    public static void doWhileFunction (int[] array) {
        int i = 0, j = 1, k = (array.length - 1);

        System.out.println("\n\nЭлементы массива через do....while: ");

        do {
            System.out.print(array[i]);
            i++;
        } while (i < array.length);

        System.out.println("\nКаждый второй элемент массива: ");

        do {
            System.out.print(array[j]);
            j = j + 2;
        } while (j < array.length);

        System.out.println("\nЭлементы в обратном порядке: ");

        do {
            System.out.print(array[k]);
            k--;
        } while (k > -1);
    }

    public static void whileFunction(int[] array) {
        int i = 0, j = 1, k = (array.length - 1);

        System.out.println("\n\nЭлементы массива через while: ");

        while (i < array.length) {
            System.out.print(array[i]);
            i++;
        }

        System.out.println("\nКаждый второй элемент массива: ");

        while (j < array.length) {
            System.out.print(array[j]);
            j = j + 2;
        }

        System.out.println("\nЭлементы в обратном порядке: ");

        while (k > -1) {
            System.out.print(array[k]);
            k--;
        }
    }

    public static void forFunction(int[] array) {
                System.out.println("\n\nЭлементы массива через for: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println("\nКаждый второй элемент массива: ");

        for (int j = 1; j < array.length ; j+=2) {
            System.out.print(array[j]);
        }

        System.out.println("\nЭлементы в обратном порядке: ");

        for (int k = (array.length-1); k > -1; k--) {
            System.out.print(array[k]);
        }
    }

    public static void forEachFunction(int[] array) {
        System.out.println("\n\nЭлементы массива через foreach: ");

        for (int number : array) {
            System.out.print(number);
        }

        System.out.println("\nКаждый второй элемент массива: ");
        System.out.println("\nПока не знаю как сделать ");
/*        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number);
            }
        }
*/

        System.out.println("\nЭлементы в обратном порядке: ");
        System.out.println("\nПока не знаю как сделать ");

/*        for (int number : array) {
            int[] backArray = new int[array.length];
            backArray[i] = number;
            System.out.print(number);
        }*/
    }
}