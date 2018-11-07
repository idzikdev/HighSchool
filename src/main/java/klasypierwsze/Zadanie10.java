package klasypierwsze;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] tablica=new int[5];
        int i=0;
        while (i!=5){
            System.out.println("Podaj liczbę nr "+i);
            tablica[i]=scanner.nextInt();
            tablica[i]=tablica[i]*tablica[i];
            i++;
        }
        for (int j = 0; j < tablica.length; j++) {
            System.out.println(tablica[j]);
        }
    }
}
