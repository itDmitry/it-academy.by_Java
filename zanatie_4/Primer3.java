package zanatie_4;

import java.util.Random;

public class Primer3 {
    public static void main(String[] args) {
        int a = 0;
        int count = 0;
        double answer = 0;
        int b = 1000;
        for (int i = 0; i <b ; i++) {
            a = (int)(Math.random() * 100);
            if (a % 2 == 0){
                count++;
            }
        }
        answer = count*100d/b;
        System.out.println("Вероятность получения четного числа = " + answer + "%");
    }
}
