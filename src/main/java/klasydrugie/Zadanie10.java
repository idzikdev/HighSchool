package klasydrugie;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [][] tablica=new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 ; j++) {
                System.out.println("Podaj liczbę jako współrzędną ["+i+"]["+j+"]");
                tablica[i][j]=scanner.nextInt();
            }
        }
        int wyznacznik=tablica[0][0]*tablica[1][1]-tablica[0][1]*tablica[1][0];
        System.out.println("Główmny wyznacznik = "+wyznacznik);

    }
}
