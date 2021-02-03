/*
1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например T.
Данный класс как раз и будет решать задачу поставленную перед нами:
хранить неограниченное количество передаваемых объектов обобщённого типа.
В данном классе обязательно будет присутствовать как минимум один конструктор.
И с учётом особенностей дженериков в java,
есть три варианта как написать конструктор данного класса.
*/
package home_work_4;

import java.util.Arrays;

public class DataContainer<T>{
/*
* 2. Внутри DataContainer должно быть поле T[] data,
внутренний массив, которое предназначено для хранения передаваемых объектов.
* */
    private T[] data;

/*
Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.
* */
    public DataContainer (T[] data){
        this.data = Arrays.copyOf(data, data.length);
    }

/*
4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data.
	4.1 Если поле data не переполнено,
	 то данные нужно добавлять в первую позицию (ячейку) после последней заполненной позиции (ячейки).
		4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777).
		Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
		4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null).
		Должно получиться data = [1, 2, 3, null, null, null].
		Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
		4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777).
		Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
	4.2 В случае если поле data переполнено,
	нужно придумать механизм который будет расширять пространство для новых элементов.
	Тут вам поможет Arrays.copyOf.
		4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777].
		Метод add вернёт число 3.
*/
    public int add(T item){
         if (item != null){
                 for (int i = 0; i < data.length; i++) {
                     if (this.data[i] == null) {
                         data[i] = item;
                         return i;
                     }
                 }
                 this.data = Arrays.copyOf(this.data, data.length+1);
                 this.data[this.data.length - 1] = item;
                 return this.data.length - 1;
             }
                return -1;
        }
/*
5. В данном классе должен быть метод T get(int index).
Данный метод получает из DataContainer'а, из поля data,
предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999].
	Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
*/
    public T get(int index){
        if (index >= this.data.length){
            return null;
        } else {
            return this.data[index];
        }
    }

    /*
    * 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
    * */

    public T[] getItems(){
        return this.data;
    }

    /*
    7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
	7.1 Метод возвращает true если у нас получилось удалить данные.
		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3].
		Метод delete вернёт true
	7.2 Метод возвращает false если нет такого индекса.
		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777].
		Метод delete вернёт false
	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777].
		Метод delete вернёт true
     */
    public boolean delete(int index){
        if (index >= this.data.length){
            return false;
        } else {
//            this.data[index] = null;
            deletingFromData(data, index);
            return true;
        }
    }

    /*
    * 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
	8.1 Метод возвращает true если у нас получилось удалить данные.
		8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3].
		* Метод delete вернёт true
	8.2 Метод возвращает false если нет такого элемента.
		8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777].
		* Метод delete вернёт false
	8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
		8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3].
		* Метод delete вернёт true
		* */
    public boolean delete(T item){
        for (int index = 0; index < this.data.length; index++) {

        if (this.data[index] == item){
//                data[index] = null;
                deletingFromData(data, index);
                return true;
            }
        }
        return false;
    }


    /*
    * 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator).
    * Данный метод занимается сортировкой данных записанных в поле data
    * используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
    * */

//    public void sort(Comparator<.......> comparator){
//
//    }

    /*
    * 10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
    * */

    public String toString(){
        if (this.data != null){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i] != null){
                    stringBuilder.append(this.data[i]);
                    stringBuilder.append(" ");
                }
            }
            return stringBuilder.toString();
//           return Arrays.toString(this.data);
        } else {
            return null;
        }
    }


    /*11.* В даном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
    который будет принимать объект DataContainer с дженериком extends Comparable.
    Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer
    используя реализацию сравнения вызываемый у хранимых объектов.
    12.* В данном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container,
    Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию интерфейса Comparator.
    Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer
    используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
    13.** Реализовать в DataContainer интерфейс Iterable
    */

    private T[] deletingFromData (T[] data, int index){
        T[] temp1 = Arrays.copyOfRange(this.data, 0, index);
        T[] temp2 = Arrays.copyOfRange(this.data, index+1, this.data.length);
        this.data = (T[]) new Object[temp1.length+ temp2.length];
        int counter = 0;
        for (int i = 0; i < temp1.length; i++) {
            this.data[i] = temp1[i];
            counter++;
        }
        for (int i = 0; i < temp2.length; i++) {
            this.data[counter+i] = temp2[i];
        }
        return data;
    }
}