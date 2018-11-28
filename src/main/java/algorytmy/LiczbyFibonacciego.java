package algorytmy;

import java.util.Scanner;

public class LiczbyFibonacciego {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int suma;
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        int ile=scanner.nextInt();
        System.out.println("1");
        System.out.println("1");
        for (int i = 1; i <=ile-2 ; i++) {
            suma=a+b;
            a=b;
            b=suma;
            System.out.println(suma);
        }
    }
}