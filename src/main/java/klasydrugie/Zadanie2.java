package klasydrugie;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age=scanner.nextInt();
        if (age>=18) System.out.println("Osoba jest pełnoletnia");
        else System.out.println("Osoba nie jest pełnoletnia");
    }
}
