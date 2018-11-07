package klasydrugie;

import java.util.Scanner;

public class Zadanie16 {
    public static long potega(int a,int n){
        long result=1;
        for (int i = 1; i <=n ; i++) {
            result=result*a;
        }
        return result;
    }
    public static long potegaBis(int a,int n){
        return (long)Math.pow(a,n);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę A");
        int a=scanner.nextInt();
        System.out.println("Podaj liczbę N");
        int n=scanner.nextInt();
        System.out.println("A do potęgi N = "+potega(a,n));
        System.out.println("A do potęgi N = "+potegaBis(a,n));
    }
}
