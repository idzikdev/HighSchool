package algorytmy;

import java.util.Scanner;

public class Wydawanie {
    public static void main(String[] args) {
        int suma200 = 0;
        int suma100 = 1;
        int suma50 = 0;
        int suma20 = 2;
        int suma10 = 3;
        int suma5 = 2;
        int suma2 = 10;
        int suma1 = 2000;
        Scanner sc = new Scanner(System.in);
        int suma = sc.nextInt();
        while (suma != 0) {
            if (suma200 > 0 && suma >= 200) {
                System.out.println("Wydaje 200");
                suma = suma - 200;
                suma200=suma200-1;
                continue;
            }
            if (suma100 > 0 && suma >= 100) {
                System.out.println("Wydaje 100");
                suma = suma - 100;
                suma100=suma100-1;
                continue;
            }
            if (suma50 > 0 && suma >= 50) {
                System.out.println("Wydaje 50");
                suma = suma - 50;
                suma50=suma50-1;
                continue;
            }
            if (suma20 > 0 && suma >= 20) {
                System.out.println("Wydaje 20");
                suma = suma - 20;
                suma20=suma20-1;
                continue;
            }
            if (suma10 > 0 && suma >= 10) {
                System.out.println("Wydaje 10");
                suma = suma - 10;
                suma10=suma10-1;
                continue;
            }
            if (suma5 > 0 && suma >= 5) {
                System.out.println("Wydaje 5");
                suma = suma - 5;
                suma5=suma5-1;
                continue;
            }
            if (suma2 > 0 && suma >= 2) {
                System.out.println("Wydaje 2");
                suma = suma - 2;
                suma2=suma2-1;
                continue;
            }
            if (suma1 > 0 && suma >= 1) {
                System.out.println("Wydaje 1");
                suma = suma - 1;
                suma1=suma1-1;
                continue;
            }
        }
    }
}
