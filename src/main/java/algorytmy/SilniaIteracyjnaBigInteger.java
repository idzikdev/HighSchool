package algorytmy;

import java.math.BigInteger;
import java.util.Scanner;

public class SilniaIteracyjnaBigInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną");
        BigInteger number=scanner.nextBigInteger();
        BigInteger result= new BigInteger("1");
        for (BigInteger i=new BigInteger("2"); i.compareTo(number)<=0; i=i.add(new BigInteger("1"))) {
            result=result.multiply(i);
        }
        System.out.println("Silnia z "+number+" to "+result);
        System.out.println("Długośc bitowa "+result.bitLength());
    }
}
