package klasydrugie;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź tekst");
        String name=scanner.nextLine();
        if (new StringBuilder(name).reverse().toString().equals(name)) System.out.println("Wprowadzony tekst jest palindromem");
        else System.out.println("Wprowadzony tekst nie jest palindromem");
    }
}
