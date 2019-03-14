package klasytrzecie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strumienie {
    public static void main(String[] args) {
        Integer[] tab = {6, 4, 1, 4, 1, 2, 5, 4, 4, 0, 5, 6, 6, 6};
        Map<Integer, Integer> mapa = new TreeMap<>();
        //inicjalizacja mapy
        for (int i = 0; i < tab.length; i++) {
            if (mapa.containsKey(tab[i])) mapa.put(tab[i], mapa.get(tab[i]) + 1);
            else mapa.put(tab[i], 1);
        }
        //szukanie max
        Optional<Map.Entry<Integer, Integer>> max = mapa.entrySet()
                .stream()
                .max((o1, o2) -> o1.getValue().intValue() - o2.getValue().intValue());
        int maxValue = max.get().getValue();
        //szukanie min
        Optional<Map.Entry<Integer, Integer>> min = mapa.entrySet()
                .stream()
                .max((o1, o2) -> o2.getValue().intValue() - o1.getValue().intValue());
        int minValue = min.get().getValue();
        // wyświetlanie
        System.out.println("Najczęściej");
        for (Map.Entry<Integer, Integer> el : mapa.entrySet()
        ) {
            if (el.getValue() == maxValue) System.out.println(el.getKey());
        }
        System.out.println("Najrzadziej");
        for (Map.Entry<Integer, Integer> el : mapa.entrySet()
        ) {
            if (el.getValue() == minValue) System.out.println(el.getKey());
        }
    }
}
