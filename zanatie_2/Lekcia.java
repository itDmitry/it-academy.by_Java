package zanatie_2;

import java.util.Scanner;

public class Lekcia {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            int a,b,c;

            System.out.println("Введите число a");
            a = keys.nextInt();
            System.out.println("Введите число b");
            b = keys.nextInt();
            System.out.println("Введите число c");
            c = keys.nextInt();

            System.out.println("Наибольшее число = "+ findMaxValue(a,b,c));
        }

        keys.close();

    }

    public static int findMaxValue (int a, int b, int c){
        int max;

        if(a > b){
            max = a;
        } else {
            max = b;
        }

        if(max < c){
            max = c;
        }

        return max;
    }

}
