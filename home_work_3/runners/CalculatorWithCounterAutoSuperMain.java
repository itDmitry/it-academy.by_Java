package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper c = new  CalculatorWithCounterAutoSuper();

        System.out.println("Честный ЦИК передает, что результат вычисления = " +
                c.findAddition(c.findAddition(4.1, c.findMultiplication(15,7)),
                        c.findExponentiation(c.findDivision(28,5), 2))); // 140.45999999999998

        System.out.println("Для подсчета голосов понадобилось " + c.getCountOperation() +
                " операций"); //5
    }
}
