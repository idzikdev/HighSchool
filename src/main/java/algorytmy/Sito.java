package algorytmy;

import java.util.Scanner;

public class Sito {
    public static int [] znajdzLiczbyPierwsze(int n){
        int [] result=new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i]=1;
        }
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            for (int j = 2*i; j < result.length; j=j+i) {
//                System.out.println("Wielokrotnosc "+i+"to "+j);
                if (result[j]==1)result[j]=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj a");
        int a=scanner.nextInt();
        System.out.println("Podaj b");
        int b=scanner.nextInt();
        int [] sito=new int[b];
        sito=znajdzLiczbyPierwsze(b+1);
        int counter=0;
        sito[0]=0;
        sito[1]=0;
        System.out.println("Liczby pierwsze to");
        for (int i = a; i < sito.length ; i++) {
            if (sito[i]==1)
            {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Liczb w przedziale jest "+counter);
    }
}
