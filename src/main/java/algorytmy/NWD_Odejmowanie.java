package algorytmy;

import java.util.Scanner;

public class NWD_Odejmowanie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a=scanner.nextInt();
        System.out.println("Podaj liczbę b");
        int b=scanner.nextInt();
        int l=a;
        int p=b;
        while(a!=b){
            if (a>b) a=a-b;
            else if (b>a) b=b-a;
        }
        System.out.println("NWD("+l+","+p+")="+a);
    }
}
