package zanatie_4;

import java.util.Scanner;

public class Primer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.charAt(0) == '-'){
            System.out.println("Вы ввели не натуральное число");
        } else {
            char[] chars = str.toCharArray();
            if (existNotDigit(chars)){
                System.out.println("Вы ввели не натуральное число");
            } else {
                int value = Integer.parseInt(str);
                if (value == 0){
                    System.out.println("0 - это не натуральнео число");
                } else {
                    //...
                }
            }
        }
        scanner.close();
    }

    public static boolean existNotDigit (char[] chars) {
        boolean result = false;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])){
                result = true;
                break;
            }
        }

        return result;
    }
}
