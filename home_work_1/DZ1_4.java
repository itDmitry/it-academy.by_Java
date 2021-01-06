package home_work_1;

public class DZ1_4 {

    public static boolean sleepIn (boolean weekday, boolean vacation){

        if (!weekday || vacation){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {

        boolean workingDay = true;
        boolean onVacation = false;

        if (sleepIn(workingDay, onVacation)){
            System.out.println("Можем спать дальше");
        }
        else {
            System.out.println("Пора идти на работу");
        }
    }
}
