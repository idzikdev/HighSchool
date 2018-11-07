package klasypierwsze;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj tekst");
        String text=scanner.nextLine();
        System.out.println("Wyświetlam co drugi znak");
        for (int i = 0; i < text.length() ; i=i+2) {
            System.out.print(text.charAt(i));
        }
    }
}
