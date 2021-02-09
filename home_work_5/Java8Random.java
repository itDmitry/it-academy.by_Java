package home_work_5;

import Zanatia.core.Random.api.iRandom;

import java.util.concurrent.ThreadLocalRandom;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java

public class Java8Random implements iRandom {
    @Override
    public int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    @Override
    public double randomDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    @Override
    public String randomString(int min, int max) {
        StringBuilder builder = new StringBuilder();
        int length = ThreadLocalRandom.current().nextInt(min, max + 1);

        builder.append((char)(Math.random()*32 + 'А'));
        for(int i = 0; i < length-1; i++) {
            builder.append((char)(Math.random()*32 + 'а'));
        }
        return builder.toString();
    }

    @Override
    public boolean randomBoolean() {
        return Math.random() < 0.5;
    }
}