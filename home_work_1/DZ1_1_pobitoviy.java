package home_work_1;

public class DZ1_1_pobitoviy {

    public static void main(String[] args) {

// 1. Побитовые операции.
// 1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php

// 1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
        int a;
        int b;
        int c;

        System.out.println("1. Побитовые операции. \n1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php");
        System.out.println("1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.\n" +
        "1.4 В комментариях к каждой операции написать двоичный код каждого числа и результата операции.");

        // ~	Побитовый унарный оператор NOT
        System.out.println("\n~ Побитовый унарный оператор NOT c = ~a");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = ~a;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = ~b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // &	Побитовый AND
        System.out.println("\n& Побитовый AND c = a & b");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = a & b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // &=	Побитовый AND с присваиванием
        System.out.println("\n&= Побитовый AND с присваиванием a &= b");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        a &= b;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));

        // |	Побитовый OR
        System.out.println("\n| Побитовый OR c = a | b");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = a | b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // |=	Побитовый OR с присваиванием
        System.out.println("\n|= Побитовый OR с присваиванием a |= b");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        a |= b;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));

        // ^	Побитовый исключающее OR
        System.out.println("\n^ Побитовый исключающее OR c = a ^ b");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = a ^ b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // ^=	Побитовый исключающее OR с присваиванием
        System.out.println("\n^= Побитовый исключающее OR с присваиванием a ^= b");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        a ^= b;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));

        // >>	Сдвиг вправо
        System.out.println("\n>> Сдвиг вправо c = a >> 3");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = a >> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = b >> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // >>=	Сдвиг вправо с присваиванием
        System.out.println("\n>>= Сдвиг вправо с присваиванием a >>= 3");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        a >>= 3;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        b >>= 3;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));

        // >>>	Сдвиг вправо с заполнением нулями
        System.out.println("\n>>> Сдвиг вправо с заполнением нулями c = a >>> 3");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = a >>> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = b >>> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // <<	Сдвиг влево
        System.out.println("\n<< Сдвиг влево на c = a << 3");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = a << 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = b << 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // <<=	Сдвиг влево с присваиванием
        System.out.println("\n<<= Сдвиг влево с присваиванием a <<= 3");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        a <<= 3;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        b <<= 3;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));

        // >>>=	Сдвиг вправо с заполнением нулями с присваиванием
        System.out.println("\n>>>= Сдвиг вправо с заполнением нулями с присваиванием a >>>= 3");
        a = 42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        a >>>= 3;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = 15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        b >>>= 3;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));

        // 1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
        System.out.println("\n\n1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.\n" +
        "1.4 В комментариях к каждой операции написать двоичный код каждого числа и результата операции.");

        // ~	Побитовый унарный оператор NOT
        System.out.println("\n~ Побитовый унарный оператор NOT c = ~a");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = ~a;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = ~b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // &	Побитовый AND
        System.out.println("\n& Побитовый AND c = a & b");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = a & b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // &=	Побитовый AND с присваиванием
        System.out.println("\n&= Побитовый AND с присваиванием a &= b");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        a &= b;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));

        // |	Побитовый OR
        System.out.println("\n| Побитовый OR c = a | b");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = a | b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // |=	Побитовый OR с присваиванием
        System.out.println("\n|= Побитовый OR с присваиванием a |= b");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        a |= b;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));

        // ^	Побитовый исключающее OR
        System.out.println("\n^ Побитовый исключающее OR c = a ^ b");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = a ^ b;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // ^=	Побитовый исключающее OR с присваиванием
        System.out.println("\n^= Побитовый исключающее OR с присваиванием a ^= b");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        a ^= b;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));

        // >>	Сдвиг вправо
        System.out.println("\n>> Сдвиг вправо c = a >> 3");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = a >> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = b >> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // >>=	Сдвиг вправо с присваиванием
        System.out.println("\n>>= Сдвиг вправо с присваиванием a >>= 3");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        a >>= 3;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        b >>= 3;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));

        // >>>	Сдвиг вправо с заполнением нулями
        System.out.println("\n>>> Сдвиг вправо с заполнением нулями c = a >>> 3");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = a >>> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = b >>> 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // <<	Сдвиг влево
        System.out.println("\n<< Сдвиг влево на c = a << 3");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        c = a << 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        c = b << 3;
        System.out.println("c=" + c + " " + Integer.toBinaryString(c));

        // <<=	Сдвиг влево с присваиванием
        System.out.println("\n<<= Сдвиг влево с присваиванием a <<= 3");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        a <<= 3;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        b <<= 3;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));

        // >>>=	Сдвиг вправо с заполнением нулями с присваиванием
        System.out.println("\n>>>= Сдвиг вправо с заполнением нулями с присваиванием a >>>= 3");
        a = -42;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        a >>>= 3;
        System.out.println("a=" + a + " " + Integer.toBinaryString(a));
        b = -15;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));
        b >>>= 3;
        System.out.println("b=" + b + " " + Integer.toBinaryString(b));

        System.out.println("\n\n1. Побитовые операции. \n1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php");
        System.out.println("1.5 Попробуйте сделать побитовую операцию с числова 42.5");

        double test = 42.5;
        System.out.println("test=" + test + " " + Long.toBinaryString((long) test));

        // >>	Сдвиг вправо
        System.out.println("\n>> Сдвиг вправо test = test >> 3");
//        double test2 = test >> 3;
        System.out.println("Что-то пошло не так.");

    }
}
