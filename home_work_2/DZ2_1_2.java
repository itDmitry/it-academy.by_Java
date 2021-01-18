/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе
перемножить между собой и вывести ход вычислений в консоль.
Пользователь обязан ввести целое число.
Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
*/
package home_work_2;

public class DZ2_1_2 {
    public static void main(String[] args) {
        int chislo = 0;
        int dlina = 0;

        for (String arg : args) {
            System.out.println("Аргумент к исполняемой программе = " + arg +"\n");
            try {
                  chislo = Integer.parseInt(arg,10);
            } catch (NumberFormatException e1)  {
                  try {
                      Double.parseDouble(arg);
                      System.out.println("Введено не целое число");
                  } catch (NumberFormatException e2) {
                      System.out.println("Введено не число");
                  }
            }
            dlina = arg.length();
        }

        System.out.println(multiplicationOfNumbers(dlina, chislo));
    }

    public static long multiplicationOfNumbers (int dlinaMassiva, int dlinnoeChislo){
        int[] array = new int[dlinaMassiva];

        System.out.println("Перемножаем между собой цифры числа " + dlinnoeChislo + "\n");

        for (int i = array.length; i > 0 ; i--) {
            array[i-1] = dlinnoeChislo % 10;
            dlinnoeChislo = dlinnoeChislo / 10;
        }

        long result = 1;

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + " = ");
            } else {
                System.out.print(array[i] + " * ");
            }
            result *= array[i];
        }

        return result;
    }
}
