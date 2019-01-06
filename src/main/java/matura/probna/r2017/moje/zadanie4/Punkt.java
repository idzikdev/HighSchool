package matura.probna.r2017.moje.zadanie4;

public class Punkt {
    private double x;
    private double y;
    public int ktoraCwiartka(){
        if (x>0 && y>0) return 1;
        if (x>0 && y<0) return 2;
        if (x<0 && y<0) return 3;
        return 4;
    }
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
