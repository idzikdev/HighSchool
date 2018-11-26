package algorytmy;

import java.util.Scanner;

public class Horner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("podaj stopień wielomianu");
        int n=sc.nextInt();
        int tab[]=new int[n+1];
        System.out.println("podaj wspólczynniki");
        for(int i=0;i<=n;i++)
            tab[i]=sc.nextInt();
        int wynik=tab[0];
        System.out.println("podaj x");
        int x=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            wynik=wynik*x+tab[i];
        }
        System.out.println("Wartość wielomianu w punkcie "+x+" wynosi "+wynik);

    }
}
