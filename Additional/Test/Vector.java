package Additional.Test;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector () {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double countLength (){
        return Math.sqrt(x*x + y*y + z*z);
    }
}