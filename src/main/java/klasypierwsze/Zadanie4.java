package klasypierwsze;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź imię");
        String name=scanner.nextLine();
        if (name.endsWith("a")) System.out.println("Imię jest żeńskie");
        else System.out.println("Imię jest męskie");
    }
}
