package algorytmy;

public class Calkowanie {
    public static double f(double x){
        return x;
    }

    public static void main(String[] args) {
        double a=0;
        double b=1;
        double n=100000;
        double x=(b-a)/n;
        double suma=0;
        for (int i = 0; i <=n ; i++) {
            suma=suma+x*f(a+i*x);
        }
        System.out.println(suma);
    }
}
