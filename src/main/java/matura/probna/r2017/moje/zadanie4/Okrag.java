package matura.probna.r2017.moje.zadanie4;

public class Okrag implements Comparable<Okrag>{
    private double x;
    private double y;
    private double r;

    public Okrag(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
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

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return x+" "+y+" "+r+"\n";
    }

    @Override
    public int compareTo(Okrag o) {
        if (this.getX()==o.getX()) {
            return (int)(this.getY()-o.getY());
        }
        return (int)(this.getX()-o.getX());
    }
    public boolean czyStyczny(){
        if (r==Math.abs(y)) return true;
        return false;
    }
}
