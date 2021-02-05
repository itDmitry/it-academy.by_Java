/*package Zanatia;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>(10000);

        for (int i = 0; i < 10000; i++) {
            boolean olymp;
            if(Math.random()*100 > 50){
                olymp = true;
            } else {
                olymp = false;
            }
            arrayList.add(new Student(i+1, randomNameGenerator(), (int) Math.random()*10+7, Math.random()*10d/10, olymp));
        }

    }

    public static ArrayList filterByAge (ArrayList arrayList){

        ArrayList copyOfArrayList = new ArrayList();

        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Student temp = (Student) arrayList.get(i);
            if (temp.getAge() >= 12) {
                copyOfArrayList[counter] = arrayList.get(i);
            }
        }
    }

    public static void listSort(ArrayList arrayList){

    }

    public static String randomNameGenerator() {
        StringBuilder builder = new StringBuilder();
            int length = (int) (Math.random()*10);
            for(int i = 0; i < length; i++) {
                builder.append((char)(Math.random()*26 + 'a'));;
            }
        return builder.toString();
        }

}*/