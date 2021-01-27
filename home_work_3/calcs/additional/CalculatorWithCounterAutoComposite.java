/*
* 7. Создать класс CalculatorWithCounterAutoComposite.
	7.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем что передал вам пользователь вашего класса.
	7.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	7.3 В данном классе должны быть следующие варианты конструктора:
		7.3.1 Принимающий объект типа CalculatorWithOperator
		7.3.2 Принимающий объект типа CalculatorWithMathCopy
		7.3.3 Принимающий объект типа CalculatorWithMathExtends
	7.4 Данный класс напрямую не умеет считать математику,
	он умеет делегировать расчёт математики другим калькуляторам переданным в конструктор
	7.5 В классе должны присутствовать математические методы:
		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	7.6 В классе должен быть метод long getCountOperation()
	который должен возвращать количество использований данного калькулятора.
	При вызове данного метода счётчик учёта не увеличивается.
*/
package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private int countOperation;

    public void incrementCountOperation(){
        this.countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    private boolean isOperator = false;
    private boolean isCopy = false;
//    private boolean isExtends = false;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
        isOperator = true;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
        isCopy = true;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
//        isExtends = true;
    }

    public double findDivision(double first, double second) {
        incrementCountOperation();
        if (isOperator) {
            return calculatorWithOperator.findDivision(first, second);
        } else if (isCopy)
            return calculatorWithMathCopy.findDivision(first, second);
        else {
            return calculatorWithMathExtends.findDivision(first, second);
        }
    }

    public double findMultiplication(double first, double second) {
        incrementCountOperation();
        if (isOperator) {
            return calculatorWithOperator.findMultiplication(first, second);
        } else if (isCopy)
            return calculatorWithMathCopy.findMultiplication(first, second);
        else {
            return calculatorWithMathExtends.findMultiplication(first, second);
        }
    }

    public double findDeduction(double first, double second) {
        incrementCountOperation();
        if (isOperator) {
            return calculatorWithOperator.findDeduction(first, second);
        } else if (isCopy)
            return calculatorWithMathCopy.findDeduction(first, second);
        else {
            return calculatorWithMathExtends.findDeduction(first, second);
        }
    }

    public double findAddition(double first, double second) {
        incrementCountOperation();
        if (isOperator) {
            return calculatorWithOperator.findAddition(first, second);
        } else if (isCopy)
            return calculatorWithMathCopy.findAddition(first, second);
        else {
            return calculatorWithMathExtends.findAddition(first, second);
        }
    }

    public double findExponentiation(double first, int second) {
        incrementCountOperation();
        if (isOperator) {
            return calculatorWithOperator.findExponentiation(first, second);
        } else if (isCopy)
            return calculatorWithMathCopy.findExponentiation(first, second);
        else {
            return calculatorWithMathExtends.findExponentiation(first, second);
        }
    }

    public double findModule(double only) {
        incrementCountOperation();
        if (isOperator) {
            return calculatorWithOperator.findModule(only);
        } else if (isCopy)
            return calculatorWithMathCopy.findModule(only);
        else {
            return calculatorWithMathExtends.findModule(only);
        }
    }

    public double findSquareRoot(double only) {
        incrementCountOperation();
        if (isOperator) {
            return calculatorWithOperator.findSquareRoot(only);
        } else if (isCopy)
            return calculatorWithMathCopy.findSquareRoot(only);
        else {
            return calculatorWithMathExtends.findSquareRoot(only);
        }
    }
}