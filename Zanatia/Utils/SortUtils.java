package Zanatia.Utils;

import Zanatia.Comparators.StudentNameComparator;
import Zanatia.dto.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortUtils {

    public static <T> void sortWithComporatorBubble(ArrayList<Student> container, StudentNameComparator comparator) {
        int dlinaСontainera = container.size();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (dlinaСontainera - 1); i++) {
                T first = container.get(i);
                T second = container.get(i+1);
                int compare = comparator.compare(container.get(i), container.get(i+1));
                if (compare > 0 ) {
                    container.set(i, second);
                    container.set(i+1, first);
                    isSorted = false;
                }
                if (isSorted) {
                    break;
                }
            }
        }
    }

    public static <T> void sortWithComporatorShaker(List<T> container, Comparator<T> comparator) {
        int dlinaСontainera = container.size();
        int leftBorder = 0;
        int rightBorder = dlinaСontainera - 1;
        boolean isSorted;
        while (leftBorder < rightBorder) {
            isSorted = true;
            for (int i = leftBorder; i < rightBorder; i++) {
                T first = container.get(i);
                T second = container.get(i+1);
                int compare = comparator.compare(container.get(i), container.get(i+1));
                if (compare > 0) {
                    container.set(i, second);
                    container.set(i+1, first);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            rightBorder--;
            for (int i = rightBorder; i > leftBorder; i--) {
                T first = container.get(i-1);
                T second = container.get(i);
                int compare = comparator.compare(container.get(i-1), container.get(i));
                if (compare > 0) {
                    container.set(i-1, second);
                    container.set(i, first);
                    isSorted = false;
                }
            }
            leftBorder++;
            if (isSorted) {
                break;
            }
        }
    }
}
