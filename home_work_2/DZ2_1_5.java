/*.5. Вывести таблицу умножения в консоль.
В консоли должно получиться также как и на картинке (динозаврика рисовать не надо):
https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
*/
package home_work_2;

public class DZ2_1_5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }


        for (int element : array) {
            for (int j = 2; j < 6; j++) {
                if (j == 5) {
                    if (element == 10) {
                        System.out.print(j + " x " + element + " = " + j * element);
                    } else {
                        if (j * element < 10) {
                            System.out.print(j + " x  " + element + " =  " + j * element);
                        } else {
                            System.out.print(j + " x  " + element + " = " + j * element);
                        }
                    }
                } else {
                    if (element == 10) {
                        System.out.print(j + " x " + element + " = " + j * element + " | ");
                    } else {
                        if (j * element < 10) {
                            System.out.print(j + " x  " + element + " =  " + j * element + " | ");
                        } else {
                            System.out.print(j + " x  " + element + " = " + j * element + " | ");
                        }
                    }
                }

            }
            System.out.println();
        }

        System.out.println("_____________________________________________________");
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 6; j < 10; j++) {
                if (j == 9){
                    if (array[i] == 10) {
                        System.out.print(j + " x " + array[i] + " = " + j * array[i]);
                    } else {
                        if (j * array[i] < 10) {
                            System.out.print(j + " x  " + array[i] + " =  " + j * array[i]);
                        } else {
                            System.out.print(j + " x  " + array[i] + " = " + j * array[i]);
                        }
                    }
                } else {
                    if (array[i] == 10) {
                        System.out.print(j + " x " + array[i] + " = " + j * array[i] + " | ");
                    } else {
                        if (j * array[i] < 10) {
                            System.out.print(j + " x  " + array[i] + " =  " + j * array[i] + " | ");
                        } else {
                            System.out.print(j + " x  " + array[i] + " = " + j * array[i] + " | ");
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}
