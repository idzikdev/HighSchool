package klasydrugie;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadź tekst");
        String name=scanner.nextLine();
        for (int i = 0; i < name.length(); i=i+3) {
            System.out.println(name.charAt(i));
        }
    }
}
