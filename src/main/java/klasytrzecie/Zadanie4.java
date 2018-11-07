package klasytrzecie;

import java.util.HashMap;
import java.util.Map;

public class Zadanie4 {
    public static void main(String[] args) {
        int [] tablica={4,4,5,1,3,4,5,6,1,5,6};
        Map<Integer,Integer> mapa=new HashMap<Integer, Integer>();
        for (int i = 0; i < tablica.length; i++) {
            if (mapa.containsKey(tablica[i])) mapa.put(tablica[i],mapa.get(tablica[i])+1);
            else mapa.put(tablica[i],1);
        }
        int max=1;
        int elMax=tablica[0];
        for (Map.Entry<Integer,Integer> el:mapa.entrySet()
             ) {
            if (el.getValue()>max){
                elMax=el.getKey();
                max=el.getValue();
            }
        }
        System.out.println("Najczęściej występuje element "+elMax+". Występuje` on "+max+" razy.");
    }
}
