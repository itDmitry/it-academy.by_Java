/*
6. Создать класс CalculatorWithCounterAutoSuper.
	6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
	6.2 Данный класс наследует класс CalculatorWithMathExtends.
	6.5 Данный класс переопределяет все методы полученные в результате наследования
	и в этих методах должен быть реализован механизм учёта их использования (учёт общий для всех методов класса),
	а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя.
	Например вызвали метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
	Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3).
	Использование super позволит вызвать реализацию из родительского класса.
	6.6 В классе должен быть метод long getCountOperation()
	который должен возвращать количество использований данного калькулятора.
	При вызове данного метода счётчик учёта не увеличивается.
	6.7 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора
	и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
*/
package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int countOperation;

    public void incrementCountOperation(){
        this.countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    public double findDivision(double first, double second){
        incrementCountOperation();
        return super.findDivision(first, second);
    }

    public double findMultiplication(double first, double second){
        incrementCountOperation();
        return super.findMultiplication(first, second);
    }

    public double findDeduction(double first, double second){
        incrementCountOperation();
        return super.findDeduction(first, second);
    }

    public double findAddition(double first, double second){
        incrementCountOperation();
        return super.findAddition(first, second);
    }

    public double findExponentiation(double first, int second) {
        incrementCountOperation();
        return super.findExponentiation(first, second);
    }

    public double findModule(double only) {
        incrementCountOperation();
        return super.findModule(only);
    }

    public double findSquareRoot(double only) {
        incrementCountOperation();
        return super.findSquareRoot(only);
    }
}
