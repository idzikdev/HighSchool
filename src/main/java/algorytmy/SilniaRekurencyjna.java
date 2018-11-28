package algorytmy;

import java.util.Scanner;

public class SilniaRekurencyjna {
    public static long silnia(long n){
        if ((n==0 || n==1)) return 1;
        return silnia(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println(silnia(n));
    }
}
