package algorytmy;

import java.util.Scanner;

public class NWD_Dzielenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę b");
        int b = scanner.nextInt();
        int l = a;
        int p = b;
        int temp;
        while (b != 0) {
          temp=a%b;
          a=b;
          b=temp;
        }
        System.out.println("NWD(" + l + "," + p + ")=" + a);
    }
}
