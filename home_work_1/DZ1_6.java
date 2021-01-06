package home_work_1;

public class DZ1_6 {
    /*
    6.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main,
    данный метод будет принимает один параметр и будет возвращать строку в отформатированном виде.
    В метод будет передаваться массив из 10 цифр (от 0 до 9).
    Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
    Например передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890.
    (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
    В задании нельзя использовать колекции, стрима.
     */

    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println((createPhoneNumber(array)));

    }

    public static String createPhoneNumber(int[] numbers){
        String phone = String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3],
                numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
        return phone;
    }
}
