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

public class DZ2_2_1 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();

        System.out.println("Получился массив " + Arrays.toString(container));
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
}
