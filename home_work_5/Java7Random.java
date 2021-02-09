package home_work_5;

import Zanatia.core.Random.api.iRandom;

import java.util.Random;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java

public class Java7Random implements iRandom {
    @Override
    public int randomInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    @Override
    public double randomDouble(double min, double max) {
        Random rand = new Random();
        double randomNum = rand.nextDouble()*(max - min) + min;
        return randomNum;
    }

    @Override
    public String randomString(int min, int max) {
        String bukvi = "авбгдеёжзийклмнопрстуфхцшщчъыьэюя";
        String bukviBig = "АБВГДЕЁХЗИЙКЛМНОПРСТУФХЦЧШЩЫЭЮЯ";
        Random rand = new Random();
        int length = rand.nextInt((max - min) + 1) + min;
        StringBuilder name = new StringBuilder();
        name.append(bukviBig.charAt((int)(Math.random()*31)));
        for(int i = 0; i < length-1; i++) {
            name.append(bukvi.charAt((int)(Math.random()*33)));
        }
        return name.toString();
    }

    @Override
    public boolean randomBoolean() {
        Random rand = new Random();
        return rand.nextInt() < 0.5;
    }
}