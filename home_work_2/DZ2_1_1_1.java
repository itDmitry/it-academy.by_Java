/*
1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint,
если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
1.1.1. Используя только цикл
*/
package home_work_2;

public class DZ2_1_1_1 {
    public static void main(String[] args) {

        long vvod = 0;

        for (String arg : args) {
            vvod = Integer.parseInt(arg);
            System.out.println("Аргумент к исполняемой программе = " + vvod +"\n");
        }

        if (vvod >= 0){
            System.out.println("\nОтвет = " + peremnozhit(vvod));
        } else {
            System.out.println("Введи корректный аргумент и перезапусти программу!");
        }
    }

    public static long peremnozhit (long vvod){
        long result = 1;

        for (int i = 1; i < (vvod+1); i++) {
            result *= i;

            if (i > 1){
                System.out.print(" * " + i);
                if (i == vvod){
                    System.out.println(" = " + result);
                }
            } else {
                System.out.print(i);
            }

/*
           if (result > Long.MAX_VALUE / (i+1)){
                System.out.println("\nНа следующей итерации произойдет переполнение переменной result типа long. " +
                        "Максимальный аргумент равен " + i);
            }
*/

        }

        return result;
    }
}