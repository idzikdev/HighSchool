package klasydrugie;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę rzeczywistą");
        double number=scanner.nextDouble();
        System.out.println("Jej wartość całkowita to "+(int)number);
    }
}
