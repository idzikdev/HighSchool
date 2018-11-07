package klasytrzecie;

import lekcje.Sectoid;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zadanie2 {
    public static boolean czyKodPocztowy(String string){
        if ((string.length()==6) && (Character.isDigit(string.charAt(0))) &&  (Character.isDigit(string.charAt(1)))
                && (Character.isDigit(string.charAt(3))) && (Character.isDigit(string.charAt(4)))
                && (Character.isDigit(string.charAt(5))) && ((string.charAt(2)=='-'))) return true;
        return false;
    }
    public static boolean czyKodPocztowy2(String string){
        return Pattern.matches("[0-9]{2}-[0-9]{3}",string);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string=scanner.nextLine();
        if (czyKodPocztowy(string) && czyKodPocztowy2(string)) System.out.println("Ciąg znaków jest poprawnym kodem pocztowym");
        else System.out.println("Ciąg znaków nie jest poprawnym kodem pocztowym");
    }
}
