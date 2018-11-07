package klasydrugie;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string=scanner.nextLine();
        System.out.println("Ostatnia litera to "+string.charAt(string.length()-1));
    }
}
