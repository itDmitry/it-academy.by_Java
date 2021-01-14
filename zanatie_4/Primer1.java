package zanatie_4;

import java.util.Arrays;
import java.util.Random;

public class Primer1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }

        System.out.println("initial array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }

        System.out.println("New array");
        for (int element : array) {
            element += 10;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nNew array 2");
        System.out.println(Arrays.toString(array));
    }


}
