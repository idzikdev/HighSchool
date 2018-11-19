package algorytmy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LiczbyFibonacciego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile chcesz kolejnych liczb Fibonacciego (>2)");
        int ile = scanner.nextInt();
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger suma ;
        System.out.println("Liczba nr 1 : " + a);
        System.out.println("Liczba nr 2 : " + b);
        for (int i = 3; i < ile + 1; i++) {
            suma = a.add(b);
            a = b;
            b = suma;
            System.out.println("Liczba nr " + i + " : " + suma);
        }
        System.out.println("Którą kolejną liczbę Fibonnaciego chcesz wyświetlić");
        int n=scanner.nextInt();
        long start=System.nanoTime();
        BigDecimal p5=BigDecimal.valueOf(Math.sqrt(5));
        BigDecimal resultL=BigDecimal.ONE.add(p5).divide(new BigDecimal("2"));
        BigDecimal resultR=BigDecimal.ONE.subtract(p5).divide(new BigDecimal("2"));
//        ((Math.pow((1+p5)/2,n)-Math.pow((1-p5)/2,n))/p5);

        resultL=resultL.pow(n);
        resultR=resultR.pow(n);
        BigDecimal result=resultL.subtract(resultR).divide(p5);
        long stop=System.nanoTime();
        System.out.println(result.toBigInteger());
        System.out.println("Trwało to : "+(int)((stop-start)/1000000000)+" sekund");
    }
}
