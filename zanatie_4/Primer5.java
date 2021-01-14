package zanatie_4;

import java.util.Scanner;

public class Primer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько раз нужно посчитаться Фибоначчи, чтобы выиграть выборы?");
        String s = scanner.nextLine();
        int a;
        try {
            a = Integer.parseInt(s, 10);
        } catch (NumberFormatException e) {
            System.out.println("Бюллетень испорчен! Перезапусти программу и брось нормальный бюллетень в урну!");
            return;
        }

        System.out.println("Голосование понеслось!");

        long first = 0;
        System.out.println(first);
        long second = 1;
        System.out.println(second);
        long sum = 1;
        System.out.println(sum);
        int counter = 0;

        while (counter < a){
            first = second;
            second = sum;
            sum = second + first;
            counter++;
            System.out.println(sum);
        }

        System.out.println("Голосование завершено! Фибоначчи победил с " + counter + " голосами!");
    }
}
