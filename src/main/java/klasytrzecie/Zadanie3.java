package klasytrzecie;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string=scanner.nextLine();
        int counter=0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) counter++;
        }
        System.out.println(counter);
    }
}
