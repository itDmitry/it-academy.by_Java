package home_work_2.DZ2_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorts {

    public static int[] arrayGeneration (){
        int maxArraySize = 100;
        int maxElementValue = 100;
        int[] array = new int[new Random().nextInt(maxArraySize)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(maxElementValue);
        }
        System.out.println("\nСгенерирован массив:\n" + Arrays.toString(array)  +
                "\nДлина сгенерированного массива = " + array.length);

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

    public static int[] bubbleSort (int[] array){
        System.out.println("\nМассив до пузырьковой сортировки по версии Павла Латушко и НАУ:\n" + Arrays.toString(array));
        int[] newArray = array.clone();
        int temp = 0;
        int counterOfIterations = 0;
        boolean swapsPerIteration = false;
        while  (counterOfIterations < (newArray.length -1)) {
            swapsPerIteration = false;
            for (int i = 0; i < (newArray.length-1); i++) {
                if (newArray[i] > newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    swapsPerIteration = true;
                }
            }
            if (!swapsPerIteration){
                break;
            }
            counterOfIterations++;
        }

        System.out.println("Число циклов сортировки = " + counterOfIterations);
        System.out.println("Массив после пузырьковой сортировки по версии Павла Латушко и НАУ:");
        return newArray;
    }

    public static int[] shakerSort (int[] array){
        System.out.println("Массив до шейкерной сортировки по версии Павла Латушко и НАУ:\n" + Arrays.toString(array));
        int[] newArray = array.clone();
        int leftBorder = 0;
        int rightBorder = newArray.length - 1;
        int temp = 0;
        int counterOfIterations = 0;
        boolean swapsPerIteration = false;
        while  (leftBorder < rightBorder) {
            swapsPerIteration = false;
            for (int i = leftBorder; i < rightBorder; i++) {
                if (newArray[i] > newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    swapsPerIteration = true;
                }
            }
            rightBorder--;
            for (int i = rightBorder; i > leftBorder; i--) {
                if (newArray[i] < newArray[i - 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = temp;
                    swapsPerIteration = true;
                }
            }
            if (!swapsPerIteration){
                break;
            }
            leftBorder++;
            counterOfIterations += 2;
        }

        System.out.println("Число циклов сортировки = " + counterOfIterations);
        System.out.println("Массив после шейкерной сортировки по версии Павла Латушко и НАУ:");
        return newArray;
    }
}
