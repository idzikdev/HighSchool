package klasydrugie;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number=scanner.nextInt();
        if (number%4==0) System.out.println("Liczba jest podzielna przez 4");
        else System.out.println("Liczba nie jest podzielna przez 4");
    }
}
