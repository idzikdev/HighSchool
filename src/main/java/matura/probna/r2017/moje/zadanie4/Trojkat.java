package matura.probna.r2017.moje.zadanie4;

public class Trojkat {
    private Punkt a;
    private Punkt b;
    private Punkt c;

    public double distance(Punkt x,Punkt y){
        return Math.sqrt((x.getX()-y.getX())*(x.getX()-y.getX())+(x.getY()-y.getY())*(x.getY()-y.getY()));
    }
    public double pole(){
        double distanceA=distance(a,b);
        double distanceB=distance(a,c);
        double distanceC=distance(b,c);
        double polowa=(distanceA+distanceB+distanceC)/2;
        return Math.sqrt(polowa*(polowa-distanceA)*(polowa-distanceB)*(polowa-distanceC));
    }

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Punkt getA() {
        return a;
    }

    public void setA(Punkt a) {
        this.a = a;
    }

    public Punkt getB() {
        return b;
    }

    public void setB(Punkt b) {
        this.b = b;
    }

    public Punkt getC() {
        return c;
    }

    public void setC(Punkt c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
