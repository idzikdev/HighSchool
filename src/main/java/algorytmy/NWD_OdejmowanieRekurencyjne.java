package algorytmy;

import java.util.Scanner;

public class NWD_OdejmowanieRekurencyjne {
    public static int NWD(int a,int b){
        if (a>b) {
            return NWD(a-b,b);
        }
        else if (b>a){
            return NWD(b,b-a);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a=scanner.nextInt();
        System.out.println("Podaj liczbę b");
        int b=scanner.nextInt();
        System.out.println("NWD = "+NWD(a,b));
    }
}
