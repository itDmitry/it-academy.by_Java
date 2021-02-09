package Zanatia.core;

public class GlobalCounter {
    private int counter;

    public int getCounter(){
        return this.counter;
    }

    public int getAndIncCounter(){
        return this.counter++;
    }
}
