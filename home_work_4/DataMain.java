package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataMain{
    public static void main(String[] args) {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[] {"10", "1", "kjk", null, null, "drw", null, "lol", null, "0"});

        System.out.println("Массив элементов после инициализации");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Добавление элемента в массив. Индекс добавленного элемента:");
        System.out.println(dataContainer.add("1"));

        System.out.println("А если добавить null?");
        System.out.println(dataContainer.add(null));

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

        //Это тест компаратора
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
               if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 == null) {
                    return 1;
                }
                if (o2 == null) {
                    return -1;
                }
                return o1.compareTo(o2);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        dataContainer.sort(comparator);
        System.out.println("Вывод массиваа после сортировки (comporator):");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        DataContainer<String> dataContainer2 =
                new DataContainer<>(new String[] {"10", "1", "kjk", "drw", "lol", "0"});

        System.out.println("Массив элементов dataContainer2 после инициализации");
        System.out.println(Arrays.toString(dataContainer2.getItems()));

        dataContainer.sort(dataContainer2);
        System.out.println("Вывод массиваа после сортировки (dataContainer2):");
        System.out.println(Arrays.toString(dataContainer2.getItems()));

        DataContainer<String> dataContainer3 =
                new DataContainer<>(new String[] {"10", "1", "kjk", null, null, "drw", null, "lol", null, "0"});

        System.out.println("Массив элементов dataContainer3 после инициализации");
        System.out.println(Arrays.toString(dataContainer3.getItems()));

        dataContainer.sort(dataContainer3, comparator);
        System.out.println("Вывод массиваа после сортировки(dataContainer3, comporator):");
        System.out.println(Arrays.toString(dataContainer3.getItems()));

    }
}