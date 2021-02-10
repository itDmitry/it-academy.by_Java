package home_work_5;

import Zanatia.core.Random.api.iRandom;

import java.util.concurrent.ThreadLocalRandom;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java

public class Java8RandomNames extends Java8Random implements iRandom {
    private String[] arrayOfNames = {"Александр", "Сергей", "Яна", "Август", "Авдей", "Аверкий", "Аверьян",
            "Авксентий", "Автоном", "Агап", "Агафон", "Аггей", "Адам", "Адриан и Андриян", "Азарий", "Аким",
            "Александр", "Алексей", "Амвросий", "Амос", "Ананий", "Анатолий", "Андрей", "Андрон", "Андроник",
            "Аникей", "Аникита", "Анисим и Онисим", "Антип", "Антонин"};

    @Override
    public String randomString(int min, int max) {
        String name = "";
        do {
            int i = (int)(Math.random()*arrayOfNames.length);
            if (arrayOfNames[i].length() >= min && arrayOfNames[i].length() <= max) {
                name = arrayOfNames[i];
            }
        } while (!(name.length() >= min && name.length() <= max));
        return name;
    }
}