package lekcje;

import java.util.Scanner;

public class SystemyLiczbowe {
    public static void changeRadix(int number,int radix){
        StringBuilder kek = new StringBuilder();
        while (number != 0)
        {
            kek.append(number%radix);
            number /= radix;
        }
        System.out.println(kek.reverse());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int radix = scanner.nextInt();
        int liczba=scanner.nextInt(radix);
        System.out.println("Dziesiętnie "+liczba);
        int radix2 = scanner.nextInt();
        changeRadix(liczba, radix2);
    }
}
