/*
1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint,
если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
1.1.2.* Используя рекурсию
*/
package home_work_2;

public class DZ2_1_1_2 {
    public static void main(String[] args) {

        int vvod = 0;

        for (String arg : args) {
            vvod = Integer.parseInt(arg);
            System.out.println("Аргумент к исполняемой программе = " + vvod +"\n");
        }

        if (vvod >= 0){
            System.out.println("Перемножение:");
            System.out.print(peremnozhit(vvod));
        } else {
            System.out.println("Введи корректный аргумент и перезапусти программу!");
        }

    }

    public static long peremnozhit (int vvod){
        long result = 1;

        if (vvod == 0) {
            System.out.print(" = ");
            return result;
        }
        if (vvod == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(vvod);
        if (vvod != 2) {
            System.out.print(" * ");
        }

        result = vvod * peremnozhit(vvod-1);
        return result;
    }
}

