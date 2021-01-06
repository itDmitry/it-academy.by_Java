package home_work_1;

public class DZ1_7 {
    /*
    7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа.
    В методе можно использовать обычную математику которая описана в теории. Теория https://planetcalc.ru/747.
    Если число отрицательное то выдавать дополнительный код. Пример:
	7.1 Вводим: 42.  Возвращает: 00101010
	7.2 Вводим: 15.  Возвращает: 00001111
	7.3 Вводим: -42. Возвращает: 11010110
	7.4 Вводим: -15. Возвращает: 11110001
     */
    public static void toBinaryString(byte number){
        if (number >= 0){
            System.out.println(Integer.toBinaryString(number));
        }
        else {
            System.out.println("0");
        }
    }

        public static void binar(int a){
            int b;
            String temp = "";
            while(a !=0){
                b = a%2;
                temp = b + temp;
                a = a/2;
            } System.out.print(temp);
        }

    public static void main(String[] args) {

                    binar(5);


/*        toBinaryString((byte)42);
        toBinaryString((byte)15);
        toBinaryString((byte)-42);
        toBinaryString((byte)-15); */

    }
}
