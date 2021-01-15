/*
4.* Выполнить сортировку массива с числами.
!!!!ВНИМАНИЕ!!!! код сортировок в данном ДЗ не должен дублироваться и не должен находиться в main.
Дублирование кода сортировок приведёт к провалу выполнения данного задания.
Итогом выполнения данного задания будет 1 класс который содержит методы с сортировками,
и 1 класс из которого вызываются данные методы:
    4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки] ->
    [Каким стал массив после сортировки]". Для преобразования массива в текст можно использовать класс Arrays.
	4.2. Пишем следующие алгоритмы:
		4.2.1. Пузырьковая сортировка
		4.2.2. Шейкерная сортировка
	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
		4.3.1. {1,2,3,4,5,6}
		4.3.2. {1,1,1,1}
		4.3.3. {9,1,5,99,9,9}
		4.3.4. {}
	4.4. После тестов написать код который будет создавать массив рандомной длинны,
	заполнять массив рандомными числами. Отсортировать.
	4.5. После рандома написать код который будет создавать массив руками через консоль. Отсортировать.
*/
package home_work_2.DZ2_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] testArray1 =  {1,2,3,4,5,6};
        System.out.println(Arrays.toString(testArray1) + "->" + Arrays.toString(Sorts.bubbleSort(testArray1)));
        System.out.println(Arrays.toString(testArray1) + "->" + Arrays.toString(Sorts.shakerSort(testArray1)));

        int[] testArray2 =  {1,1,1,1};
        System.out.println(Arrays.toString(testArray2) + "->" + Arrays.toString(Sorts.bubbleSort(testArray2)));
        System.out.println(Arrays.toString(testArray2) + "->" + Arrays.toString(Sorts.shakerSort(testArray2)));

        int[] testArray3 =  {9,1,5,99,9,9};
        System.out.println(Arrays.toString(testArray3) + "->" + Arrays.toString(Sorts.bubbleSort(testArray3)));
        System.out.println(Arrays.toString(testArray3) + "->" + Arrays.toString(Sorts.shakerSort(testArray3)));

        int[] testArray4 =  {};
        System.out.println(Arrays.toString(testArray4) + "->" + Arrays.toString(Sorts.bubbleSort(testArray4)));
        System.out.println(Arrays.toString(testArray4) + "->" + Arrays.toString(Sorts.shakerSort(testArray4)));

        int [] array = arrayGeneration();
        System.out.println(Arrays.toString(array) + "->" + Arrays.toString(Sorts.bubbleSort(array)));
        System.out.println(Arrays.toString(array) + "->" + Arrays.toString(Sorts.shakerSort(array)));

        int [] arrayConsole = arrayConsoleGeneration();
        System.out.println(Arrays.toString(arrayConsole) + "->" + Arrays.toString(Sorts.bubbleSort(arrayConsole)));
        System.out.println(Arrays.toString(arrayConsole) + "->" + Arrays.toString(Sorts.shakerSort(arrayConsole)));
    }

    public static int[] arrayGeneration (){
        int maxArraySize = 20;
        int maxElementValue = 100;
        int[] array = new int[new Random().nextInt(maxArraySize)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(maxElementValue);
        }

        return array;
    }

    public static int[] arrayConsoleGeneration (){
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
