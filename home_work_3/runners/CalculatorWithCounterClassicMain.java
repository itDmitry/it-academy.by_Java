/*
	5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1,
	при каждой математической операции самостоятельно вызывать метод incrementCountOperation() для увеличения счётчика.
	Вывести в консоль результат.
*/
package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic = new  CalculatorWithCounterClassic();

        double testMyCalc;
        double temp;
//        4.1 + 15 * 7 + Math.pow((28d / 5), 2);

        testMyCalc = calculatorWithCounterClassic.findDivision(28,5);
        calculatorWithCounterClassic.incrementCountOperation();

        testMyCalc = calculatorWithCounterClassic.findExponentiation(testMyCalc, 2);
        calculatorWithCounterClassic.incrementCountOperation();

        temp = calculatorWithCounterClassic.findMultiplication(15,7);
        calculatorWithCounterClassic.incrementCountOperation();

        testMyCalc = calculatorWithCounterClassic.findAddition(testMyCalc, temp);
        calculatorWithCounterClassic.incrementCountOperation();

        testMyCalc = calculatorWithCounterClassic.findAddition(4.1, testMyCalc);
        calculatorWithCounterClassic.incrementCountOperation();

        System.out.println("Честный ЦИК передает, что результат вычисления = " + testMyCalc); // 140.45999999999998

        System.out.println("Для подсчета голосов понадобилось " + calculatorWithCounterClassic.getCountOperation() +
                " операций"); //5
    }
}