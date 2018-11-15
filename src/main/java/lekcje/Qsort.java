package lekcje;

import java.util.Collections;
import java.util.Scanner;

public class Qsort {
    private static void quicksort(int tablica[], int l, int p) {

        int i,j,srodek,temp;
        i=l;
        j=p;
        srodek=tablica[(l+p) / 2];
        do {
            while (tablica[i]<srodek) i++;
            while (srodek<tablica[j]) j--;
            if (i<=j) {
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (l<j) quicksort(tablica,l,j);
        if (i<p) quicksort(tablica,i,p);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ilość liczb do posortowania?");
        int ile_liczb=scanner.nextInt();
        int [] tablica = new int[ile_liczb];
        for(int i=0; i<ile_liczb; i++) {
            System.out.println("Podaj liczbę nr "+(i+1));
            tablica[i] = scanner.nextInt();
        }
        System.out.println("Tablica przed posortowaniem:");
        for(int i=0; i<ile_liczb; i++)
            if (i==ile_liczb-1) System.out.println(tablica[i]);
            else System.out.print(tablica[i]+",");

        quicksort(tablica,0, ile_liczb-1);
        System.out.println("Tablica po posortowaniu:");
        for(int i=0; i<ile_liczb; i++)
            if (i==ile_liczb-1) System.out.println(tablica[i]);
            else System.out.print(tablica[i]+",");
    }
}
