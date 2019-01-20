package challenges;

import java.util.*;

public class Zadanie2 {
    public static int solution(int[] ranks) {
        List<Integer> rangi = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        int suma = 0;
        for (int i = 0; i < ranks.length; i++) {
            rangi.add(ranks[i]);
        }
        Collections.sort(rangi);
        for (Integer ranga : rangi
        ) {
            set.add(ranga);
        }
        for (Integer el : rangi
        ) {
            int i = 0;
            if (set.contains(el + 1)) {
                suma = suma + 1;
            }
        }
        return suma;
    }

    public static int binarne(int[] ranks, int rank, int l, int p) {
        return 0;
    }

    public static void main(String[] args) {
        int ranks[] = {4,4,3,3,1,0};
        System.out.println("Wynik " + solution(ranks));
    }
}
