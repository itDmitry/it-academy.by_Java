package home_work_2.DZ2_4;

public class Sorts {

    public static int[] bubbleSort (int[] array){
        int[] newArray = array.clone();
        int temp;
        boolean isSorted = false;
        while  (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (newArray.length-1); i++) {
                if (newArray[i] > newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }

        return newArray;
    }

    public static int[] shakerSort (int[] array){
        int[] newArray = array.clone();
        int leftBorder = 0;
        int rightBorder = newArray.length - 1;
        int temp;
        boolean isSorted;
        while  (leftBorder < rightBorder) {
            isSorted = true;
            for (int i = leftBorder; i < rightBorder; i++) {
                if (newArray[i] > newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
            rightBorder--;
            for (int i = rightBorder; i > leftBorder; i--) {
                if (newArray[i] < newArray[i - 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = temp;
                    isSorted = false;
                }
            }
            leftBorder++;
            if (isSorted){
                break;
            }
        }

        return newArray;
    }
}
