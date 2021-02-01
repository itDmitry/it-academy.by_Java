/*
Задача на умение работать с: Циклами, Массивами, Методами, Консолью, Условиями, Абстрактные классы*,
Наследование*, Интерфейсы*, Файлами**.

Ханойские башни:
!!!ВНИМАНИЕ!!! не пытайтесь делать сразу автоматический режим игры, начинайте именно с ручного.
Не надо делать НИКАКИХ РЕКУРСИЙ. Иначе закопаетесь в этой домашке и слезах
В идеале написать код таким образом чтобы код ручного режима можно было переиспользовать в автоматическом режиме.
Тогда можно будет применить интерфейсы, абстрактные классы, наследование

0. Правила и методы игры https://ru.wikipedia.org/wiki/%D0%A5%D0%B0%D0%BD%D0%BE%D0%B9%D1%81%D0%BA%D0%B0%D1%8F_%D0%B1%D0%B0%D1%88%D0%BD%D1%8F
1. Пример игры https://ru.goobix.com/%D0%B8%D0%B3%D1%80%D1%8B-%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD/%D1%85%D0%B0%D0%BD%D0%BE%D0%B9%D1%81%D0%BA%D0%B0%D1%8F-%D0%B1%D0%B0%D1%88%D0%BD%D1%8F/
2. Есть два режима игры:
	2.1 Ручной. В данном режиме пользователь указывает какой элемент и куда он передвигает
	2.2* Автоматический. Пользователь наблюдает за каждым шагом самостоятельной игры компьютера
3. На старте пользователю предлагают выбрать режим игры. С клавиатуры он выбирает режим. 1 - ручной, 2 - автоматический
4. Дать возможность указать количество колец с которыми мы будет играть. Минимальное - 3, максимальное - 8
5. Игровое поле в памяти приложения предлагается хранить в массиве int[][],
где число > 0 это кольцо определённого размера, 0 - это пустое место на стержне
6. Игровое поле в консоли отображает немного по другому.
Цифра - это кольцо определённого размера, * - это пустое место на стержне.
Пример: Если пользователь выберет что он будет играть с 4-мя кольцами
то стартовое поле в консоли будет выглядеть следующим образом:
	1 * *
	2 * *
	3 * *
	4 * *
7. В ручном режиме игры пользователь должен выбрать откуда и куда он будет перемещать кольцо,
либо на любом ходе может выйти из игры не закончив её.
8. После выбора пользователя вы должны проверить можно ли переместить выбранное кольцо на выбранный стержень.
9. Если переместить можно то в консоли должно отобраться новое поле и предложение о выборе следующего кода. Пример:
Было:
	1 * *
	2 * *
	3 * *
	4 * *
Пользователь выбрал ход 1->3. Значит требуется переместить верхнее кольцо на первом стержне на третий стержень.
Такой ход возможен - перемещаем:
	* * *
	2 * *
	3 * *
	4 * 1
10. Если переместить нельзя то необходимо выдать сообщение о невозможности хода и снова предложить выбрать ход. Пример:
Было:
	* * *
	2 * *
	3 * *
	4 * 1
Пользователь выбрал ход 1->3. Значит требуется переместить верхнее кольцо на первом стержне на третий стержень.
Такой ход не возможен, так как кольцо большего размера не может быть помещено на стержень с кольцом меньшего размера
(кольцо 2 на стержень 3 с кольцом 1). Выводим сообщение: К сожалению данный ход не возможен правилами игры,
выберите другой ход.
11. При успешном завершении игры необходимо выводить поздравление и выводить количество ходов
которые совершил пользователь\компьютер
12.* В автоматическом режиме может быть две реализации:
	12.1* Компьютер знает правила и сразу знает что куда перемещать и не делает неправильные ходы
	12.2** Компьютер не знает правила и как пользователь может совершать ошибки
13.* В автоматическом режиме после каждого хода компьютера должно выводиться получившееся поле
(как при игре в ручном режиме)
14.* В 7 пункте указано что пользователь на любом ходе может завершить игру.
При завершении игры предложить пользователю сохранить текущую игру и указать имя сохранения.
15.** По завершению ручной игры предложить сохранить прохождение игры.
16.** При запуске ручного режима игры предложить выбрать из двух пунктов.
1 - новая игра, 2 - загрузить сохранённую игру, 3 - запустить пройденную игру.
	16.1 Новая игра начинает игру с самого начала. Спасибо кэп.
	16.2 Загрузить сохранённую игру - загружаем незавершенную игру для продолжения игры
	16.3 Запустить пройденную игру - загружаем пройденную игру для отображения процесса уже сыгранной игры.
17.* Дать возможность указать большее количество колец - до 20.
Также дать возможность выбора количества стержней - до 8
*/
package Tower_of_Hanoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Введите число уровней башни от 3 до 8");
            x = scanner.nextInt();
        } while (x < 3 || x > 8);

        int[][] array = new int[x][3];

        risuemElementbl(array);
        vivodimPole(array);

        int otkuda = 0;
        int kuda = 0;

        do {
            System.out.println("введи с какого шеста двигаем");
            otkuda = vvodHoda(scanner);
            System.out.println(array[otkuda-1][1]);
            System.out.println(proverkaOtkuda(otkuda, array));
            System.out.println("введи на какой шест двигаем");
            kuda = vvodHoda(scanner);

 //           dvigaem (otkuda, kuda, array);

            if (isFinished(array)) {
                System.out.println("Вы выиграли!");
            }
        } while (!isFinished(array));

    }

    public static int[][] risuemElementbl (int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][0] = i + 1;
            array[i][1] = 0;
            array[i][2] = 0;
        }
        return array;
    }

    public static int[][] vivodimPole (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print("*" + "\t");
                } else {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
        return array;
    }

    public static int vvodHoda (Scanner scanner) {
        return scanner.nextInt();
    }

    public static boolean proverkaOtkuda(int otkuda, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[otkuda-1][i] != 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isFinished (int[][] array){
        int count = 0;
        for (int i = 0; i < (array[2].length - 1); i++) {
            if (array[2][i + 1] > array[2][i]) {
                count++;
            }
        }
        if (count == (array[2].length - 1)){
            return true;
        }
        return false;
    }
}