/* Буква или иной символ?
Вводится целое число, обозначающее код символа по таблице ASCII.
Определить, это код английской буквы или какой-либо иной символ.
В таблице ASCII символы букв идут по порядку - от "A" до "Z", далее через несколько небуквенных символов от "a" до "z".
Задача сводится к тому, что надо сравнить код-число, введенное пользователем,
с кодами первых и последних букв алфавита. Если код принадлежит этим диапазонам,
значит это код буквы, если нет - то небуквенный символ.
*/
package home_work_2;

import java.util.Scanner;

public class DZ2_3_letterOrNot {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        int a;
        System.out.println("Введи число от 0 до 127, а ЦИК проверит, была ли это буква в ASCII.");

        a = keys.nextInt();

        while (a < 0 || a > 127){
            System.out.println("У нас ЦИК не как у Ермошиной! Введи реально от 0 до 127.");
            a = keys.nextInt();
        }

        keys.close();

        System.out.println(letterOrNot(a) + "Честный ЦИК согласен, что это \"" + Character.toString((char)a) + "\"");
    }

    public static String letterOrNot(int a){
        String S;
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)){
                S = "Вы выбрали букву по ASCII. ";
            } else {
                S = "Вы выбрали НЕ букву по ASCII. ";
            }
        return S;
    }
}
