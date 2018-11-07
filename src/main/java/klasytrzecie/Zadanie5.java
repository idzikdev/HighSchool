package klasytrzecie;

import java.util.HashMap;
import java.util.Map;

public class Zadanie5 {
    public static void main(String[] args) {
        int [] tablica={4,2,5,1,3,4,5,6,1,5,6};
        Map<Integer,Integer> mapa=new HashMap<Integer, Integer>();
        for (int i = 0; i < tablica.length; i++) {
            if (mapa.containsKey(tablica[i])) mapa.put(tablica[i],mapa.get(tablica[i])+1);
            else mapa.put(tablica[i],1);
        }
        boolean isThreeTimes=false;
        for (Map.Entry<Integer,Integer> el:mapa.entrySet()
                ) {
            if (el.getValue()==3){
                isThreeTimes=true;
                System.out.println(el.getKey());
                break;
            }
        }
        if (isThreeTimes) System.out.println("TAK");
        else System.out.println("NIE");
    }
}
