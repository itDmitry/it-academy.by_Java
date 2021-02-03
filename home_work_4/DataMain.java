package home_work_4;

import home_work_3.calcs.ICalculator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Arrays;

public class DataMain{
    public static void main(String[] args) {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[] {"10", "1", null, "kjk", "drw", "lol", null, null, "0"});

        System.out.println("Массив элементов после инициализации");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Добавление элемента в массив. Индекс добавленного элемента:");
        System.out.println(dataContainer.add("1"));
        System.out.println("Массив элементов после добавления");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Показываем значение элемента по индексу");
        System.out.println(dataContainer.get(1));

        System.out.println("Удаляем данные по индексу");
        System.out.println(dataContainer.delete(3));
        System.out.println("Массив элементов после удаления");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Удаляем данные по значению");
        System.out.println(dataContainer.delete("kjk"));
        System.out.println("Массив элементов после удаления");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Вывод массиваа после переопределения метода toString (удаляет null):");
        System.out.println(dataContainer.toString());





        DataContainer<ICalculator> newContainer = new DataContainer<>(new ICalculator[] {new CalculatorWithCounterAutoSuper(), new CalculatorWithOperator(),
                new CalculatorWithOperator()});

        System.out.println(newContainer.toString());



    }
}
