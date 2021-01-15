package home_work_2.DZ2_4;

import java.util.Random;
import java.util.Scanner;

public class Sorts {

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

    public static int[] bubbleSort (int[] array){
        int[] newArray = array.clone();
        int temp;
        int counterOfIterations = 0;
        boolean swapsPerIteration;
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
        }

        return newArray;
    }

    public static int[] shakerSort (int[] array){
        int[] newArray = array.clone();
        int leftBorder = 0;
        int rightBorder = newArray.length - 1;
        int temp;
        boolean swapsPerIteration;
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
            if (!swapsPerIteration){
                break;
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
            leftBorder++;
            if (!swapsPerIteration){
                break;
            }
        }

        return newArray;
    }
}
