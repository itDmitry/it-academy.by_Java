package Zanatia.core.Random;

import Zanatia.core.Random.api.iRandom;

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
        StringBuilder builder = new StringBuilder();
        int length = (int) (Math.random()*10);
        for(int i = 0; i < length; i++) {
            builder.append((char)(Math.random()*26 + 'a'));
        }
        return builder.toString();
    }

    @Override
    public boolean randomBoolean() {
        return true;
    }
}
