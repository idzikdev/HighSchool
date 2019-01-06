package matura.probna.r2017.moje;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Zadanie33 {

    public static void main(String[] args) {
        int liczba=114;
        int counter=0;
        for (int i = 2; i <= liczba; i++) {
            if ((new BigInteger(String.valueOf(i)).isProbablePrime(1))&&(liczba%i==0)){
//                System.out.println(i);
                liczba=liczba/i;
                counter++;
            }
        }
        if (counter==3) System.out.println("Liczba sfeniczna");
        else System.out.println("Liczba nie jest sfeniczna");
    }
}
