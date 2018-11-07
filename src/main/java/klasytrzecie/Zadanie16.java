package klasytrzecie;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zadanie16 {
    public static void testMap(Map<Integer,String> mapa) {
        mapa.put(11, "świnka");
        mapa.put(1, "mysz");
        mapa.put(17, "szynszyla");
        mapa.put(5, "chomik");
        mapa.put(3, "pies");
        mapa.put(2, "kot");
        mapa.put(8, "lis");
        System.out.println(mapa);

    }

    public static void main(String[] args) {
        HashMap<Integer, String> hashmapa = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedhashmapa = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treemapa = new TreeMap<Integer, String>();
        System.out.println("HashMapa");
        testMap(hashmapa);
        System.out.println("LinkedHashMapa");
        testMap(linkedhashmapa);
        System.out.println("TreeMapa");
        testMap(treemapa);
    }
}
