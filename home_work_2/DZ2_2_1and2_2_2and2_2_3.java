/*
2.1 Написать метод public static int[] arrayFromConsole() рядом с main.
Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
Пример int[] container = arrayFromConsole().
Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
пользователь вводит размер (5) и его элементы по порядку {4, 17, 32}.
Соответсвенно будет создан массив размером 5 с элементами {4, 17, 32} и сохранён в переменную container.
*/
package home_work_2;

import java.util.Arrays;
import java.util.Scanner;

public class DZ2_2_1and2_2_2and2_2_3 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();

        System.out.println("Получился массив " + Arrays.toString(container));

        doWhileFunction(container);
        whileFunction(container);
        forFunction(container);
        forEachFunction(container);

        System.out.println("\n\nСлучайный массив: " + Arrays.toString(arrayRandom(5, 100)));
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

            for (int element : array) {
                System.out.print(element);
            }

            System.out.println("\nКаждый второй элемент массива: ");

            int counter = 0;

            int[] shortArray = new int[array.length / 2];
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0){
                    shortArray[counter] = array[i];
                    counter++;
                }
            }

            for (int element : shortArray) {
                System.out.print(element);
            }

            System.out.println("\nЭлементы в обратном порядке: ");
            int[] backArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                backArray[i] = array[array.length-1-i];
            }

            for (int element : backArray) {
                System.out.print(element);
            }
        }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*maxValueExclusion);
        }

        return  array;
    }
}
