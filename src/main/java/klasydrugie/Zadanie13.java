package klasydrugie;

import java.util.Scanner;

public class Zadanie13 {
    public static int sumaCyfr(int number){
        int suma=0;
        while (number!=0){
            suma=suma+number%10;
            number=number/10;
        }
        return suma;
    }
    public static int sumaCyfrBis(int number){
        String string=String.valueOf(number);
        int suma=0;
        for (int i = 0; i < string.length(); i++) {
            suma=suma+Integer.valueOf(""+string.charAt(i));
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number=scanner.nextInt();
        System.out.println("Suma cyfr "+sumaCyfr(number));
        System.out.println("Suma cyfr "+sumaCyfrBis(number));
    }
}
