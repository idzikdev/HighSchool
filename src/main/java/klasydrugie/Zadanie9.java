package klasydrugie;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password="hasełko";
        String string;
        do {
            System.out.println("Podaj hasło");
            string=scanner.nextLine();
        }
        while (!string.equals(password));
        System.out.println("Wprowadzono poprawne hasło");
    }
}
