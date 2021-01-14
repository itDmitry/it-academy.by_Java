package zanatie_4;

import java.util.Scanner;

public class Primer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проголосуйте за кашего кандидата в виде целовго числа!");
        String s = scanner.nextLine();
        int a;
        try {
            a = Integer.parseInt(s, 10);
        } catch (NumberFormatException e) {
            System.out.println("Бюллетень испорчен! Перезапусти программу и брось нормальный бюллетень в урну!");
            return;
        }

        int countEven = 0;
        int countNotEven = 0;
        while (a > 0){
            if ((a % 10) % 2 == 0) {
                countEven++;
            } else {
                countNotEven++;
            }
        a = a / 10;
        }
        System.out.println("Честный ЦИК гарантирует, что четных цифр в числе " + countEven);
        System.out.println("Честный ЦИК гарантирует, что НЕчетных цифр в числе " + countNotEven++);
    }
}