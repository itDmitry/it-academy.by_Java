/*
10.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод).
В main методе требуется создать экземпляр калькулятора
и используя методы из данного экземпляра посчитать выражения из задания 1.
Вывести в консоль результат.
В мэйне запрещается использование переменных для хранения значений участвующих в просчёте,
а также результатов работы методов калькулятора.
*/
package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory c = new CalculatorWithMemory(new CalculatorWithOperator());

        c.findDivision(28,5);
        c.findExponentiation(c.getMemory(), 2);
        c.findAddition(c.getMemory(), c.findMultiplication(15,7));
        c.findAddition(c.getMemory(),4.1);

        System.out.println(c.getMemory()); // 140.45999999999998
    }
}