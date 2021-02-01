package home_work_4;

public class DataMain {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2};
        DataContainer<Integer> dataContainer1 = new DataContainer<>(1);
        DataContainer<String> dataContainer2 = new DataContainer<>("1");

        System.out.println(dataContainer1.toString());
    }
}
