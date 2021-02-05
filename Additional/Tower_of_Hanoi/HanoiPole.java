package Additional.Tower_of_Hanoi;

public class HanoiPole {
    private int[][] pole;
    private int figura;
    private int turnCounter;
    private int koorditana1;
    private int koorditana2;


    public int getTurnCounter() {
        return this.turnCounter;
    }

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

    public boolean checkOtkuda(int hod){
        for (int i = 0; i < this.pole.length; i++) {
            if (this.pole[i][hod-1] != 0) {
                this.turnCounter++;
                return true;
            }
        }
        this.turnCounter++;
        return false;
    }

    public void getFigura(int otkuda){
        int temp = 0;
        for (int i = 0; i < this.pole.length; i++) {
            temp = this.pole[i][otkuda-1];
            if (temp != 0){
                this.figura = temp;
                this.pole[i][otkuda-1] = 0;
                this.koorditana1 = i;
                this.koorditana2 = otkuda-1;
                break;
            }
        }
    }

    public boolean checkKuda(int kuda){
        for (int i = 0; i < this.pole.length; i++) {
            if (this.pole[i][kuda-1] != 0 && this.pole[i][kuda-1] > this.figura){
                return true;
            }
            if (this.pole[i][kuda-1] != 0) {
                this.pole[koorditana1][koorditana2] = this.figura;
                return false;
            }
        }
        return true;
    }

    public void makeTurn(int hod){
            for (int i = this.pole.length; i > 0; i--) {
                if (this.pole[i-1][hod-1] == 0) {
                    this.pole[i-1][hod-1] = this.figura;
                    return;
                }
            }
    }

    public boolean finishCheck(){
        for (int i = 0; i < this.pole.length-1; i++) {
            if (this.pole[i][2] >= this.pole[i+1][2] || this.pole[i][2] == 0){
                return false;
            }
        }
        return true;
    }

}