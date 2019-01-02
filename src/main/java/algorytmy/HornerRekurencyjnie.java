package algorytmy;

import java.util.Scanner;

public class HornerRekurencyjnie {

    static int n;
    static int [] a={1,-5,6,6,0,1,2,-1,0,1};
    static int x;

    public static int Horner(int n){
        if (n==0) return a[0];
        return Horner(n-1)*x+a[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("podaj stopień wielomianu");
        n=sc.nextInt();
        System.out.println("podaj x");
        x=sc.nextInt();
        System.out.println("Wartość wielomianu w punkcie "+x+" wynosi "+Horner(n));
    }
}
