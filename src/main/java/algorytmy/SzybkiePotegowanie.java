package algorytmy;

import java.util.Scanner;

public class SzybkiePotegowanie {
    public static long potega(long a,long n){
        long result=a;
        String binarna=Integer.toBinaryString((int)n);
        for (int i=1;i<binarna.length();i++){
            if (binarna.charAt(i)=='1')
                result=result*result*a;
            else result=result*result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj dodatnią całkowitą liczbę a");
        long a=scanner.nextLong();
        System.out.println("Podaj dodatni całkowity wykładnik n");
        long n=scanner.nextLong();
        System.out.println("Potęga a^n= "+potega(a,n));
    }
}
