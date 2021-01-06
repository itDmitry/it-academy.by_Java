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
    public static String toBinaryString(byte number){
        //Если число положительное, то работаем так
        if (number >= 0){
            int [] binaryArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            byte temp;
            for (int i = (binaryArray.length - 1); i > 0 ; i--) {
                binaryArray[i] = number % 2;
                temp = (byte) (number / 2);
                number = temp;
            }
            //Выводим что получилось в двоичном представлении
            String S = String.format("%d%d%d%d%d%d%d%d", binaryArray[0], binaryArray[1], binaryArray[2],
                    binaryArray[3], binaryArray[4], binaryArray[5], binaryArray[6], binaryArray[7]);
            return S;
        }
        //Сначала делаем его по модулю и берем обычное представление
        else {
            int[] binaryArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
            byte temp;
            number = (byte) Math.abs(number);
            for (int i = (binaryArray.length - 1); i > 0; i--) {
                binaryArray[i] = number % 2;
                temp = (byte) (number / 2);
                number = temp;
            }
            //Потом его инвертируем (обратный код)
            for (int i = 0; i < binaryArray.length; i++) {
                if (binaryArray[i] == 0) {
                    binaryArray[i] = 1;
                } else {
                    binaryArray[i] = 0;
                }
            }
//Добавляем 1 для дополнительного кода.
            for (int i = (binaryArray.length - 1); i > 0; i--) {

                if (binaryArray[i] == 1){
                    binaryArray[i] = 0;
                    continue;
                }

                if (binaryArray[i] == 0) {
                    binaryArray[i] = 1;
                    break;
                }
            }
//Выводим что получилось в двоичном представлении
                String S = String.format("%d%d%d%d%d%d%d%d", binaryArray[0], binaryArray[1], binaryArray[2],
                        binaryArray[3], binaryArray[4], binaryArray[5], binaryArray[6], binaryArray[7]);
                return S;
            }
        }

    public static void main(String[] args) {
//Проверяем себя
        System.out.println("Ввели = 42, вывели " + toBinaryString((byte)42) + ", а должны были 00101010");
        System.out.println("Ввели = 15, вывели " + toBinaryString((byte)42) + ", а должны были 00001111");
        System.out.println("Ввели = -42, вывели " + toBinaryString((byte)42) + ", а должны были 11010110");
        System.out.println("Ввели = -15, вывели " + toBinaryString((byte)-15) + ", а должны были 11110001");

    }
}