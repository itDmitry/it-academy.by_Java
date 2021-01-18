/*.5. Вывести таблицу умножения в консоль.
В консоли должно получиться также как и на картинке (динозаврика рисовать не надо):
https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
*/
package home_work_2;

public class DZ2_1_5 {
    public static void main(String[] args) {
        int chisloStrok = 2;
        int chisloStolbcov = 4;
        int umnozhitOt = 1;
        int umnozhitDo = 10;
        int nachaloTablicbl = 2;

/*
Хотел использовать это для стрингбилдера, чтобы таблица была ровной при любых значених, но видимо не за чем
        int count = 0;
        int maxZnachenie = (chisloStrok*chisloStolbcov + (nachaloTablicbl-1))*umnozhitDo;
        do {
            count++;
            maxZnachenie /= 10;
        } while (maxZnachenie > 0);
*/

        for (int i = 0; i < chisloStrok; i++) {
            risuemStrokuTablicbl(chisloStolbcov, nachaloTablicbl+i*chisloStolbcov, umnozhitOt, umnozhitDo);
            if (i < chisloStrok - 1){
                System.out.println("-----------------------------------------------------");
            }
        }
    }

    public static void risuemStrokuTablicbl (int chisloStolbcov, int nachaloTablicbl, int umnozhitOt, int umnozhitDo){
        for (int i = umnozhitOt; i < umnozhitDo + 1; i++) {
            for (int j = nachaloTablicbl; j < (nachaloTablicbl + chisloStolbcov); j++) {
                if ((j + 1 - nachaloTablicbl) % chisloStolbcov == 0){
                    if (i == 10) {
                        System.out.print(j + " x " + i + " = " + j * i);
                    } else {
                        if (j * i < 10) {
                            System.out.print(j + " x  " + i + " =  " + j * i);
                        } else {
                            System.out.print(j + " x  " + i + " = " + j * i);
                        }
                    }
                } else {
                    if (i == 10) {
                        System.out.print(j + " x " + i + " = " + j * i + " | ");
                    } else {
                        if (j * i < 10) {
                            System.out.print(j + " x  " + i + " =  " + j * i + " | ");
                        } else {
                            System.out.print(j + " x  " + i + " = " + j * i + " | ");
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}