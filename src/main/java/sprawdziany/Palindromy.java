package sprawdziany;

import java.util.Scanner;

public class Palindromy {
    public static boolean czyPalindrom(String string){
        return (new StringBuilder(string).reverse().toString()
        .equals(string));
    }
    public static int ilePalindromow(String [][] tablica){
        int result=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (czyPalindrom(tablica[i][j]))result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String [][] strings=new String[2][2];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Podaj ciąg znaków");
                strings[i][j]=scanner.nextLine();
            }
        }
        System.out.println("Palindromów jest "+ilePalindromow(strings));
    }
}
