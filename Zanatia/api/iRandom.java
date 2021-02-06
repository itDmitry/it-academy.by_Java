package Zanatia.api;

public interface iRandom {
    /**
     * Возвращает ранодом int в заданом промежутке
     * @param min с
     * @param max по
     * @return рандомное число
     */
    int randomInt(int min, int max);

    /**
     * Возвращает ранодом double в заданом промежутке
     * @param min с
     * @param max по
     * @return рандомное число
     */
    double randomDouble(double min, double max);

    /**
     * Возвращает ранодом String с указанным количеством символов
     * @param min минимальное количество символовом
     * @param max максимальное количество символов
     * @return рандомная строка
     */
    String randomString(int min, int max);

    /**
     * Возвращает ранодом Boolean
     * @return рандомное значение
     */
    boolean randomBoolean();
}