/*
3. Создать класс CalculatorWithMathCopy.
	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	3.2 В классе должны присутствовать математические методы:
		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		Скопировать базовые математические операции из CalculatorWithOperator.
		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
	3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
*/
package home_work_3.calcs.simple;

import home_work_3.calcs.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double findDivision(double first, double second){
        return first / second;
    }

    public double findMultiplication(double first, double second){
        return first * second;
    }

    public double findDeduction(double first, double second){
        return first - second;
    }

    public double findAddition(double first, double second){
        return first + second;
    }

    public double findExponentiation(double first, int second){
        return Math.pow(first, second);
    }

    public double findModule(double only){
        return Math.abs(only);
    }

    public double findSquareRoot(double only){
        return Math.sqrt(only);
    }
}