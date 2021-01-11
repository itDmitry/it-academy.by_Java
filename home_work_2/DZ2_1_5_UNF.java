/*.5. Вывести таблицу умножения в консоль.
В консоли должно получиться также как и на картинке (динозаврика рисовать не надо):
https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
*/
package home_work_2;

public class DZ2_1_5_UNF {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("2 x " + array[i] + " = " + 2*array[i] + " " +
                    "3 x " + array[i] + " = " + " " + 3*array[i] + " " +
                    "4 x " + array[i] + " = " + 4*array[i] + " " +
                    "5 x " + array[i] + " = " + 5*array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("6 x " + array[i] + " = " + 6*array[i] + " " +
                    "7 x " + array[i] + " = " + " " + 7*array[i] + " " +
                    "8 x " + array[i] + " = " + 8*array[i] + " " +
                    "9 x " + array[i] + " = " + 9*array[i]);
        }
    }
}
