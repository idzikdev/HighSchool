package klasypierwsze;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number=scanner.nextInt();
        switch (number){
            case 5 :
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("15");
                break;
            default:
                System.out.println("Ani 5, ani 10, ani 15");
        }

    }
}
