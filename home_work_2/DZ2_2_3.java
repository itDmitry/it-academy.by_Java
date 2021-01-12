/*
2.3 Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
Пример: int[] container = arrayRandom(5, 100).
Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random)
и сохранён в переменную container.
*/
package home_work_2;

import java.util.Arrays;
import java.util.Scanner;

public class DZ2_2_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Голосуйте за размер массива и максимальное значение элемента." +
                " Сначала размер, затем максимальное значение");

        int[] container = arrayRandom(console.nextInt(),console.nextInt());

        console.close();

        System.out.println("Честные новости демонстрируют массив " + Arrays.toString(container));
        }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random()*maxValueExclusion);
        }

        return  array;
    }
}
