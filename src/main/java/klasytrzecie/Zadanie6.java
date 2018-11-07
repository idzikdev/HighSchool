package klasytrzecie;

import java.util.HashMap;
import java.util.Map;

public class Zadanie6 {
    public static void main(String[] args) {
        int [] tablica={3,13,45,14,27,111,2,15,10,88};
        Map<Integer,Integer> mapa=new HashMap<Integer, Integer>();
        for (int i = 0; i < tablica.length; i++) {
            if (mapa.containsKey(tablica[i]%37)) mapa.put(tablica[i]%37,mapa.get(tablica[i]%37)+1);
            else mapa.put(tablica[i]%37,1);
        }
        System.out.println(mapa.size());
    }
}
