/*
2.4 Задачи взяты с сайта https://taskcode.ru/array.
На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
2.4.1 Сумма четных положительных элементов массива
2.4.2 Максимальный из элементов массива с четными индексами
2.4.3 Элементы массива, которые меньше среднего арифметического
2.4.4 Найти два наименьших (минимальных) элемента массива
2.4.5 Сжать массив, удалив элементы, принадлежащие интервалу
2.4.6 Сумма цифр массива
*/
package home_work_2;

import java.util.Arrays;
import java.util.Scanner;

public class DZ2_2_4 {
    public static void main(String[] args) {
        int minOfElement = 3;
        int maxOfElement = 5;
        int[] container = arrayFromConsole();
        System.out.println("Получился массив " + Arrays.toString(container));

        System.out.println("Сумма четных положительных элементов массива = " + sumOfEvenPositiveElements(container));
        System.out.println("Максимальный из элементов массива с четными индексами = " +
                maxOfMassiveElementsWithEvenIndex(container));
        System.out.println("Список элементов массива, которые меньше среднего арифметического:" +
                isLesserThanAverage(container));
        System.out.println("Два наименьших элемента массива равны " + twoMinimalElementsOfMassive(container));
                System.out.println("Массив после удаления нежелательных элементов: " +
                Arrays.toString(shorteningOfMassive(container,minOfElement,maxOfElement)));
        System.out.println("Сумма цифр всех элементов равна " + findSumOfNumbers(container));
    }

    public static int[] arrayFromConsole(){
        Scanner console = new Scanner (System.in);
        System.out.println("Голосуйте за размер массива");

        int [] array = new int[console.nextInt()];

        System.out.println("Голосуйте за элементы массива");
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Голосуйте за элемент номер " + i + ", а если надоело, то напишите любую букву");
                array[i] = console.nextInt();
            } catch (java.util.InputMismatchException e){
                break;
            }
        }

        console.close();

        return array;
    }
/*
Сумма четных положительных элементов массива
В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов.
В цикле проверяем каждый элемент массива на четность и положительность.
Данные условия можно скомбинировать через логическое "И" в заголовке одного условного оператора
или использовать два (один вложен в другой) отдельных каждый со своим условием.
Если элемент массива удовлетворяет обоим условиям, то его значение добавляется к переменной, в которой хранится сумма.
После цикла ее значение выводится на экран.
Ноль является четным числом, однако он не относится к положительным.
Поэтому проверка на положительность - это "больше 0", а не "больше или равно 0".
Хотя это не столь важно, так как добавление нуля к сумме ничего не меняет.
Проверку на четность можно выполнить с помощью нахождения остатка от деления на 2.
Если остаток равен нулю, то число четное. В ряде языков есть специальные функции, проверяющие четное число или нечетное.
 */
    public static long sumOfEvenPositiveElements (int[] array){
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0){
                sum += array[i];
            }
        }

        return sum;
    }
/*
Максимальный из элементов массива с четными индексами
В массиве найти максимальный элемент с четным индексом.
Другая формулировка задачи: среди элементов массива с четными индексами, найти тот, который имеет максимальное значение.
В различных языках программирования индексация элементов выполняется по-разному.
В одних первый элемент имеет индекс 1 (например, в Паскале и КуМире), в других - 0 (Python, C, Basic).
Таким образом, в одних языках элементами с четными индексами будут второй, четвертый, шестой и т. д.
В других языках четные индексы будут у первого, третьего, пятого и т. д. элементов.
Для поиска максимума только среди четных (или среди нечетных) индексов
необходимо при переборе массива в цикле использовать шаг, равный 2.
Предположим, что первый элемент с четным индексом и есть максимальный. Присвоим его индекс переменной max.
Перебор начнем с индекса i = max + 2 до конца массива (N).
В цикле будем сравнивать значение очередного элемента со значением элемента по индексу max.
Если текущий элемент больше, то запишем его индекс в max.
*/
    public static int maxOfMassiveElementsWithEvenIndex (int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
/*
Элементы массива, которые меньше среднего арифметического
Найти в массиве те элементы, значение которых меньше среднего арифметического, взятого от всех элементов массива.
Алгоритм решения задачи:
Посчитать сумму всех элементов массива. Для этого до цикла вводится переменная для суммы (например, sum).
Далее в цикле перебираются элементы массива и значение каждого добавляется к этой переменной.
Подсчет суммы можно выполнить в том же цикле, что и заполнение массива.
Когда сумма элементов посчитана, находится среднее арифметическое,
которое равно сумме разделенной на количество элементов массива.
Массив перебирается в цикле, каждый элемент сравнивается с найденным средним значением.
Если элемент меньше, то он выводится на экран (или сохраняется в другом массиве).
 */
    public static String isLesserThanAverage (int[] array){
        String answer = "";
        long sum = 0;
        double average;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < average){
                answer = answer + " " + array[i] + ",";
            }
        }

        return answer;
    }
/*
Найти два наименьших (минимальных) элемента массива
В одномерном массиве целых чисел определить два наименьших элемента.
Они могут быть как равны между собой (оба являться минимальными), так и различаться.
Сначала можно найти минимальный элемент массива. После этого искать второй минимум,
исключив их поиска первый с помощью if. Данный способ рассматривается здесь по отношению к двум наибольшим элементам.
Сложнее задачу решить, используя один цикл перебора.
Предположим, что двумя наименьшими элементами массива являются первый и второй элемент.
Присвоим их индексы переменным m1 и m2. При этом, если первый элемент меньше второго, то его индекс присвоим m1,
иначе m1 получит значение второго элемента, а m2 первого.
Начнем перебирать массив в цикле, начиная с третьего элемента. Если он меньше элемента, чей индекс хранится в m1,
то присвоим индекс текущего элемента m1.
Иначе (если значение по индексу m1 меньше, чем по индексу i) будем проверять, не меньше ли значение по индексу i,
того что по индексу m2.
Есть один не очевидный нюанс. Допустим, в m1 указывало на значение 5, а m2 - на 10. Очередной элемент равен 3.
Мы меняем m1, и забываем о числе 5. Однако оно может оказаться как раз вторым минимумом массива.
Поэтому в программе при изменении значения m1 надо предусмотреть проверку, не меньше ли теряемое значение, чем то,
что хранится по индексу m2.
 */
    public static String twoMinimalElementsOfMassive (int[] array){
        int min1, min2;

        if (array[0] < array[1]){
            min1 = array[0];
            min2 = array[1];
        } else {
            min1 = array[1];
            min2 = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] <= min1) {
                min2 = min1;
                min1 = array[i];
                continue;
            }

            if (array[i] < min2){
                min2=array[i];
            }
        }
        String answer = min1 + " и " + min2;

        return answer;
    }
/*
Сжать массив, удалив элементы, принадлежащие интервалу
Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b].
Освободившиеся в конце массива элементы заполнить нулями.
Задачу можно разбить на три подзадачи:
Удаление элементов массива, принадлежащих заданному интервалу.
Сдвиг оставшихся элементов.
Заполнение "освободившейся" части массива нулями.
На самом деле первая и вторая подзадача решаются совместно по следующему алгоритму:
В цикле перебираем элементы массива, начиная с первого.
При обнаружении элемента, принадлежащего удаляемому интервалу,
размерность массива уменьшаем на единицу (поэтому лучше использовать цикл while, а не for.),
остальную (правую) часть массива сдвигаем на одну ячейку в лево.
Сдвиг правой части массива выполняется в цикле от текущего индекса элемента до размерности массива.
После того, как все элементы, принадлежащие заданному интервалу будут удалены,
следует заполнить конец массива нулями от элемента с индексом на единицу больше новой размерности массива
до количества элементов в "старом" массиве.
Данная задача схожа с этой.
*/
    public static int[] shorteningOfMassive (int[] array, int min, int max){
        /*
        Scanner keys = new Scanner(System.in);
        int a, b;
        System.out.println("\nВведите минимум и максимум значения элементов, которые будут вырезаны из массива");

        do{
            System.out.println("Введи минимум значения элемента");
            a = keys.nextInt();
            System.out.println("Введи максимум значения элемента");
            b = keys.nextInt();

            if (b < a){
                System.out.println("Честный ЦИК предупреждает, что такого интервала не существует!");
            }
        } while (b < a);

        keys.close();
*/
        int newArrayLength = array.length;
//        int[] safeArray = array.clone();
        int[] safeArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            safeArray[i] = array[i];
        }
        
        for (int i = 0; i < safeArray.length; i++) {
            if (safeArray[i] >= min && safeArray[i] <= max){
                newArrayLength--;
                for (int j = i; j < (safeArray.length-1); j++) {
                    safeArray[j] = safeArray[j+1];
                }
            }
        }

        int[] newArray = new int[newArrayLength];

        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
/*
Сумма цифр массива
Найти сумму всех цифр целочисленного массива. Например, если дан массив [12, 104, 81],
то сумма всех его цифр будет равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17.
Каждое элемент-число массива следует разбить на цифры.
Сделать это можно с помощью последовательного нахождения остатка от деления числа на 10 нацело,
после чего само число делится нацело на десять (чтобы избавиться от последней уже учтенной цифры).
Это делается в цикле while до тех пор, пока исходное число не обнулится.
Каждую извлеченную цифру следует добавить к переменной, содержащей общую сумму.
Ей присваивается нуль до вхождения в цикл перебора элементов массива.
Перед тем как последовательно делить в цикле очередное число массива необходимо присвоить его другой переменной
(в примерах ниже num), иначе все элементы массива обнулятся, хотя сумма цифр исходного массива будет посчитана.
В приведенных примерах решения задачи на языках программирования заполнение массивов
и подсчет сумм выполняются в одном цикле.
*/
    public static long findSumOfNumbers (int[] array){
        int sum = 0;

        for (int element : array) {
            while (element > 0){
                sum += element % 10;
                element = element /10;
            }
        }

        return sum;
    }
}
