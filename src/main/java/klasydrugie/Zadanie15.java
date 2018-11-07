package klasydrugie;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number=scanner.nextInt();
        int suma=2;
        System.out.println("Znaleziono dzielnik "+1);
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                System.out.println("Znaleziono dzielnik "+i);
                suma++;
            }
        }
        if (number!=1) System.out.println("Znaleziono dzielnik "+number);
        else suma=suma-1;
        System.out.println("Liczba "+number+" ma "+suma+" dzielników");
    }
}
