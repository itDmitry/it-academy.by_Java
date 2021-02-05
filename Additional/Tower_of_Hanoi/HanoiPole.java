package Additional.Tower_of_Hanoi;

public class HanoiPole {
    private int[][] pole;
    private int figura;

    public HanoiPole (int size){
        this.pole = new int[size][3];
        zapolnitPole();
    }

    public void zapolnitPole (){
        for (int i = 0; i < this.pole.length; i++) {
            this.pole[i][0] = i + 1;
            this.pole[i][1] = 0;
            this.pole[i][2] = 0;
        }
    }

    public void vivodimPole(){
        for (int i = 0; i < this.pole.length; i++) {
            for (int j = 0; j < this.pole[i].length; j++) {
                if (this.pole[i][j] == 0){
                    System.out.print("*" + "\t");
                } else {
                    System.out.print(this.pole[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public void chooseFigura(int otkuda){
        int figura = 0;
        for (int i = 0; i < this.pole.length; i++) {
            figura = this.pole[i][otkuda-1];
            if (figura != 0){
                this.figura = figura;
            }
        }
    }


}