/*
10*. Создать CalculatorWithMemory.
	10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора
	и обеспечить его дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
	10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	10.3 Данный класс напрямую не умеет считать математику.
	10.4 В классе должны присутствовать математические методы:
		10.4.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		10.4.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	10.5 Функция памяти работает через методы:
		10.5.1 Записать в память результат выполнения последнего вызванного метода.
		У данного метода не должно быть параметров.
		10.5.2 Получить из памяти записанное значение.
		При получении записи из памяти память стирается, при записи нового значения память перезаписывается.
*/
package home_work_3.calcs.additional;

import home_work_3.calcs.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private ICalculator icalculator;
    private double memory;
    private double calculation;

    public void setMemory() {
        this.memory = calculation;
    }

    public double getMemory(){
        double temp = memory;
        memory = 0;
        return temp;
    }

    public CalculatorWithMemory(ICalculator icalculator){
        this.icalculator = icalculator;
    }


    @Override
    public double findDivision(double first, double second) {
        calculation = this.icalculator.findDivision(first, second);
        setMemory();
        return calculation;
    }

    @Override
    public double findMultiplication(double first, double second) {
        calculation = this.icalculator.findMultiplication(first, second);
        setMemory();
        return calculation;
    }

    @Override
    public double findDeduction(double first, double second) {
        calculation = this.icalculator.findDeduction(first, second);
        setMemory();
        return calculation;
    }

    @Override
    public double findAddition(double first, double second) {
        calculation = this.icalculator.findAddition(first, second);
        setMemory();
        return calculation;
    }

    @Override
    public double findExponentiation(double first, int second) {
        calculation = this.icalculator.findExponentiation(first, second);
        setMemory();
        return calculation;
    }

    @Override
    public double findModule(double only) {
        calculation = this.icalculator.findModule(only);
        setMemory();
        return calculation;
    }

    @Override
    public double findSquareRoot(double only) {
        calculation = this.icalculator.findSquareRoot(only);
        setMemory();
        return calculation;
    }
}