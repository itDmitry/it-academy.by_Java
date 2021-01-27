/*
	7.7 Создать класс CalculatorWithCounterAutoCompositeMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
*/
package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite cOperator =
                new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());

        System.out.println("Честный ЦИК передает, что результат вычисления = " +
                cOperator.findAddition(cOperator.findAddition(4.1, cOperator.findMultiplication(15,7)),
                        cOperator.findExponentiation(cOperator.findDivision(28,5), 2))); // 140.45999999999998

        System.out.println("Для подсчета голосов понадобилось " + cOperator.getCountOperation() +
                " операций"); //5

        CalculatorWithCounterAutoComposite cCopy =
                new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());

        System.out.println("Честный ЦИК передает, что результат вычисления = " +
                cCopy.findAddition(cCopy.findAddition(4.1, cCopy.findMultiplication(15,7)),
                        cCopy.findExponentiation(cCopy.findDivision(28,5), 2))); // 140.45999999999998

        System.out.println("Для подсчета голосов понадобилось " + cCopy.getCountOperation() +
                " операций"); //5

        CalculatorWithCounterAutoComposite cExtends =
                new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());

        System.out.println("Честный ЦИК передает, что результат вычисления = " +
                cExtends.findAddition(cExtends.findAddition(4.1, cExtends.findMultiplication(15,7)),
                        cExtends.findExponentiation(cExtends.findDivision(28,5), 2))); // 140.45999999999998

        System.out.println("Для подсчета голосов понадобилось " + cExtends.getCountOperation() +
                " операций"); //5
    }
}