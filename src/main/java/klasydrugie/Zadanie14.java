package klasydrugie;

import java.util.Scanner;

public class Zadanie14 {
    public static boolean isPrime(int number){
        for (int i = 2; i <= (int) Math.sqrt(number) ; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number=scanner.nextInt();
        if (isPrime(number)) System.out.println("Liczba jest pierwsza");
        else System.out.println("Liczba nie jest pierwsza");
    }
}
