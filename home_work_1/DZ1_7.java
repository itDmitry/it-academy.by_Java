package home_work_1;

import java.util.Arrays;

public class DZ1_7 {
    /*
    7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа.
    В методе можно использовать обычную математику которая описана в теории. Теория https://planetcalc.ru/747.
    Если число отрицательное то выдавать дополнительный код. Пример:
	7.1 Вводим: 42.  Возвращает: 00101010
	7.2 Вводим: 15.  Возвращает: 00001111
	7.3 Вводим: -42. Возвращает: 11010110
	7.4 Вводим: -15. Возвращает: 11110001
     */
    public static void toBinaryString(byte number){
        if (number >= 0){
            int [] binaryArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            byte temp;
            for (int i = (binaryArray.length - 1); i > 0 ; i--) {
                binaryArray[i] = number%2;
                temp = (byte)(number/2);
                number = temp;
            }
            System.out.println(String.format("%d%d%d%d%d%d%d%d", binaryArray[0], binaryArray[1], binaryArray[2],
                    binaryArray[3], binaryArray[4], binaryArray[5], binaryArray[6], binaryArray[7]));
        }
        else {
            int [] binaryArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            byte temp;
            number = (byte)Math.abs(number);
            for (int i = (binaryArray.length - 1); i > 0 ; i--) {
                binaryArray[i] = number%2;
                temp = (byte)(number/2);
                number = temp;
            }
            for (int i = 0; i < binaryArray.length; i++) {
                if (binaryArray[i] == 0){
                    binaryArray[i] = 1;
                }
                else {
                    binaryArray[i] = 0;
                }
            }

/*            if (binaryArray[binaryArray.length-1] == 0)
            {
                binaryArray[binaryArray.length-1] = 1;
            }
            else{
                if (binaryArray[binaryArray.length-2] == 0){
                    binaryArray[binaryArray.length-2] = 1;
                }
            } */

            System.out.println(String.format("%d%d%d%d%d%d%d%d", binaryArray[0], binaryArray[1], binaryArray[2],
                    binaryArray[3], binaryArray[4], binaryArray[5], binaryArray[6], binaryArray[7]));
        }
    }

    public static void main(String[] args) {

        System.out.print("Ввели = 42, вывели ");
        toBinaryString((byte)42);
        System.out.print("Ввели = 15, вывели ");
        toBinaryString((byte)15);
        System.out.print("Ввели = -42, вывели ");
        toBinaryString((byte)-42);
        System.out.print("Ввели = -15, вывели ");
        toBinaryString((byte)-15);

    }
}
