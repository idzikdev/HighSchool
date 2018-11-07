package algorytmy;

import java.util.Scanner;

public class SilniaIteracyjna {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną");
        int number=scanner.nextInt();
        int result=1;
        for (int i = 2; i <= number; i++) {
            result=result*i;
        }
        System.out.println("Silnia z "+number+" to "+result);
    }
}
