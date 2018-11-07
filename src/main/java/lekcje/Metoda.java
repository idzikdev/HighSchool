package lekcje;

import java.util.*;

public class Metoda {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        Set<Integer> set=new TreeSet<>();
        System.out.println(set);
        System.out.println("Podaj ilość liczb w losowaniu");
        int x=scanner.nextInt();
        System.out.println("Podaj a");
        int a=scanner.nextInt();
        System.out.println("Podaj b");
        int b=scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            while (set.size()!=6) {
                int temp = random.nextInt(b - a + 1) + a;
                set.add(temp);
            }
            System.out.println(set);
            set.clear();
        }

    }
}
