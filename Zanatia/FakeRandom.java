package Zanatia;

import Zanatia.api.iRandom;

public class FakeRandom implements iRandom {
    @Override
    public int randomInt(int min, int max) {
        return 17;
    }

    @Override
    public double randomDouble(double min, double max) {
        return 10.0;
    }

    @Override
    public String randomString(int min, int max) {
        return "Случайное имя";
    }

    @Override
    public boolean randomBoolean() {
        return true;
    }
}
