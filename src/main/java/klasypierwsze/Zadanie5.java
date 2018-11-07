package klasypierwsze;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku");
        int a=scanner.nextInt();
        System.out.println("Podaj długość drugiego boku");
        int b=scanner.nextInt();
        System.out.println("Podaj długość trzeciego boku");
        int c=scanner.nextInt();
        if ((a+b>c) && (a+c>b) && (b+c>a)) {
            System.out.println("Podane liczby, jako długości boki, tworzą trójkat");
            if ((a*a+b*b==c*c) || (a*a+c*c==b*b) || (b*b+c*c==a*a)) System.out.println("Trójkąt jest prostokątny");
            else System.out.println("Trójkąt nie jest prostokątny");
        }
        else System.out.println("Podane liczby, jako długości boków, nie tworzą trójkąta");
    }
}
