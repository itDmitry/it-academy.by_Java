/*
9. Создать класс CalculatorWithCounterAutoCompositeInterface.
	9.1 Внутри класса нельзя создавать объекты,
	можно пользоваться только тем что передал вам пользователь вашего класса.
	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	9.4 Данный класс напрямую не умеет считать математику,
	он умеет делегировать расчёт математики другим калькуляторам переданным в конструктор.
	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
	9.6 В классе должен быть метод long getCountOperation()
	который должен возвращать количество использований данного калькулятора.
	При вызове данного метода счётчик учёта не увеличивается.
*/
package home_work_3.calcs.additional;

import home_work_3.calcs.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator {
    private final ICalculator calculator;

    private int countOperation;

    public void incrementCountOperation(){
        this.countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double findDivision(double first, double second) {
        incrementCountOperation();
        return calculator.findDivision(first, second);
    }

    @Override
    public double findMultiplication(double first, double second) {
        incrementCountOperation();
        return calculator.findMultiplication(first, second);
    }

    @Override
    public double findDeduction(double first, double second) {
        incrementCountOperation();
        return calculator.findDeduction(first, second);
    }

    @Override
    public double findAddition(double first, double second) {
        incrementCountOperation();
        return calculator.findAddition(first, second);
    }

    @Override
    public double findExponentiation(double first, int second) {
        incrementCountOperation();
        return calculator.findExponentiation(first, second);
    }

    @Override
    public double findModule(double only) {
        incrementCountOperation();
        return calculator.findModule(only);
    }

    @Override
    public double findSquareRoot(double only) {
        incrementCountOperation();
        return calculator.findSquareRoot(only);
    }
}