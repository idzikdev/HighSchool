package algorytmy;

import java.util.Scanner;

public class NWD_DzielenieRekurencyjne {
    public static int NWD(int a,int b){
        if (b == 0) return a;
        else return NWD(b,a%b);
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
