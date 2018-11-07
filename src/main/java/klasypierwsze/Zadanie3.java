package klasypierwsze;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int first=scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int second=scanner.nextInt();
        System.out.println("Suma to "+(first+second));
    }
}
