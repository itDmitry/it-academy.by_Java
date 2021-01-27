/*
8. Создать интерфейс ICalculator.
	8.1 В данном интерфейсе должны быть объявлены методы:
		8.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		8.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	8.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов
	созданных нами в пакетах calcs.simple

Данный интерфейс позволит использовать композицию так чтобы это всё-таки было удобно.
*/
package home_work_3.calcs;

public interface ICalculator {

    double findDivision(double first, double second);

    double findMultiplication(double first, double second);

    double findDeduction(double first, double second);

    double findAddition(double first, double second);

    double findExponentiation(double first, int second);

    double findModule(double only);

    double findSquareRoot(double only);
}