package klasydrugie;

import java.util.Scanner;

public class Zadanie12 {
    public static boolean czyTrojkat(double a,double b, double c){
        return ((a+b>c) && (a+c>b) && (b+c>a));
    }
    public static double obliczPole(double a,double b,double c){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku");
        double a=scanner.nextDouble();
        System.out.println("Podaj długość drugiego boku");
        double b=scanner.nextDouble();
        System.out.println("Podaj długość trzeciego boku");
        double c=scanner.nextDouble();
        if (czyTrojkat(a,b,c)) {
            System.out.println("Pole wynosi "+obliczPole(a,b,c));
        }
    }
}
