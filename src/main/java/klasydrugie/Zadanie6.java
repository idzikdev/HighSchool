package klasydrugie;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj napis");
        String string=scanner.nextLine();
        System.out.println("Napis odwrócony to ");
        for (int i = string.length()-1; i >=0 ; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
