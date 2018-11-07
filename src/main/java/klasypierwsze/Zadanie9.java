package klasypierwsze;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int suma=0;
        int number;
        do {
            System.out.println("Podaj liczbę");
            number=scanner.nextInt();
            suma=suma+number;
        }
        while (number!=0);
        System.out.println("Suma liczba "+suma);
    }
}
