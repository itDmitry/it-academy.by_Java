/*
2. Создать класс CalculatorWithOperator.
	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	2.2 В классе должны присутствовать математические методы:
		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
		каждый из этих методов должен принимать два параметра (определитесь с их типами)
		и должны возвращать результат (определиться с возвращаемым типом результата)
		при помощи ключевого слово return.
		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	2.3 В методах можно использовать любые арифметические операторы.
	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня).
	Если у Вас плохо с математикой, то для реализации метода "Корень из числа"
	можно воспользоваться библиотекой Math.
	2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
	посчитать выражения из задания 1. Вывести в консоль результат.
*/
package home_work_3.calcs.simple;

import home_work_3.calcs.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        for (int i = 1; i < second; i++) {
            first *= first;
        }
        return first;
    }

    public double findModule(double only){
        if (only < 0 ){
            return -only;
        } else {
            return only;
        }
    }

    public double findSquareRoot(double only){
        return Math.sqrt(only);
    }
}