package klasytrzecie;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string=scanner.nextLine();
        if (new StringBuilder(string).reverse().toString().equals(string)) System.out.println("Ciąg znaków jest palindromem");
        else System.out.println("Ciąg znaków nie jest palindromem");
    }
}
