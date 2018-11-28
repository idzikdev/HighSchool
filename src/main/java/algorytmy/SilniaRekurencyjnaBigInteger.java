package algorytmy;

import java.math.BigInteger;
import java.util.Scanner;

public class SilniaRekurencyjnaBigInteger {
    public static BigInteger silnia(BigInteger n){
        if ((n.compareTo(BigInteger.ZERO)==0 || n.compareTo(BigInteger.ONE)==0)) return BigInteger.ONE;
        return silnia(n.subtract(BigInteger.ONE)).multiply(n);
    }
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner=new Scanner(System.in);
        BigInteger n=scanner.nextBigInteger();
        System.out.println(silnia(n));
    }
}
