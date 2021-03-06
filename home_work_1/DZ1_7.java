package home_work_1;

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

    public static void main(String[] args) {

        System.out.println("Ввели = 0, вывели " + toBinaryString((byte)0) + ", а должны были 00000000");
        System.out.println("Ввели = 42, вывели " + toBinaryString((byte)42) + ", а должны были 00101010");
        System.out.println("Ввели = 15, вывели " + toBinaryString((byte)15) + ", а должны были 00001111");
        System.out.println("Ввели = -42, вывели " + toBinaryString((byte)-42) + ", а должны были 11010110");
        System.out.println("Ввели = -15, вывели " + toBinaryString((byte)-15) + ", а должны были 11110001");

    }

    public static String toBinaryString(byte number){
        int [] binaryArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0};

        if (number == 0){
            return String.format("%d%d%d%d%d%d%d%d", binaryArray[0], binaryArray[1], binaryArray[2],
                    binaryArray[3], binaryArray[4], binaryArray[5], binaryArray[6], binaryArray[7]);
            //Здесь вычислений не нужны, т.к. массив уже нулевой.
        }

        if (number > 0){
            for (int i = (binaryArray.length - 1); i > 0 ; i--) {
                binaryArray[i] = number % 2;
                number = (byte) (number / 2);
            }
        }

        if(number < 0){
            number = (byte) Math.abs(number);
            for (int i = (binaryArray.length - 1); i > 0; i--) {
                if (number % 2 == 0) {
                    binaryArray[i] = 1;
                } else {
                    binaryArray[i] = 0;
                }
                number = (byte) (number / 2);
            }
//Добавляем 1 бит для дополнительного кода.
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
        }
        //Выводим что получилось в двоичном представлении
        return String.format("%d%d%d%d%d%d%d%d", binaryArray[0], binaryArray[1], binaryArray[2],
                binaryArray[3], binaryArray[4], binaryArray[5], binaryArray[6], binaryArray[7]);
        }

}