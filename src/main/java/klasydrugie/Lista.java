package klasydrugie;

import java.util.*;

public class Lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "mysz",
                "kot",
                "pies",
                "kot",
                "pies",
                "pies",
                "wrona"));
        Map<String, Integer> mapa = new HashMap<>();
        for (String el : list
        ) {
            if (mapa.containsKey(el)) {
                mapa.replace(el, mapa.get(el) + 1);
            } else {
                mapa.put(el, 1);
            }
        }
        for (Map.Entry<String, Integer> el : mapa.entrySet()
        ) {
            System.out.println("Klucz " + el.getKey());
            System.out.println("Wartość " + el.getValue());
        }

    }
}