package zanatie_2;

import java.util.Scanner;

public class Lekcia {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int a;
        boolean b;
        double d;

        System.out.println("Введи число!");
        a = keys.nextInt();

        System.out.println("Введи \"true\" для перевода в байты или \"false\" для перевода в килобайты");
        b = keys.nextBoolean();

        if (b){
            d = a*1024;
        } else {
            d = a/1024;
        }

        System.out.println(d);

    }


        /*

        Поиск нечетного числа
        Scanner keys = new Scanner(System.in);

        int a, b;
        System.out.println("Введите число a");
        a = keys.nextInt();
        System.out.println("Введите число b");
        b = keys.nextInt();

        if (a%2 == 0 && b%2 ==0){
            a = a+1;
            System.out.println(a);
        } else if (a%2 == 1 && b%2 ==1){
                a = a+1;
                System.out.println(b);
        } else if (a%2 == 1){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

 */



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

    public static int findNechetValue (int a, int b, int c){
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
