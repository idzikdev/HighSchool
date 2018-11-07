package klasydrugie;

import java.util.Scanner;

public class Zadanie17 {
    public static void revers(int n){
        Scanner scanner=new Scanner(System.in);
        int [] tablica=new int[n];
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj element nr "+i);
            tablica[i]=scanner.nextInt();
        }
        System.out.println("Elementy w odwrotnej kolejności");
        for (int i = tablica.length-1; i >=0 ; i--) {
            System.out.println(tablica[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę elementów");
        int n=scanner.nextInt();
        revers(n);
    }
}
