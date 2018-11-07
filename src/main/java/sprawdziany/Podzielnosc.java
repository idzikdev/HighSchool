package sprawdziany;

import java.util.Scanner;

public class Podzielnosc {
    public static void main(String[] args) {
        int [][] tablica=new int[3][3];
        Scanner scanner=new Scanner(System.in);
        int p3=0;int p4=0;int p5=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Podaj liczbę");
                tablica[i][j]=scanner.nextInt();
                if (i>j){
                    if (tablica[i][j]%3==0)p3++;
                    if (tablica[i][j]%4==0)p4++;
                    if (tablica[i][j]%5==0)p5++;
                }
            }
        }
        System.out.println("Podzielnych przez 3 "+p3);
        System.out.println("Podzielnych przez 4 "+p4);
        System.out.println("Podzielnych przez 5 "+p5);
    }
}
