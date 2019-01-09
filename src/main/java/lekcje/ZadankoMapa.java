package lekcje;

import java.util.HashMap;
import java.util.Map;

public class ZadankoMapa {
    public static void main(String[] args) {
        String cos="dffdgfgfdhfagAhhg".toLowerCase();
        Map<Character,Integer> mapa=new HashMap<>();
        for (int i = 0; i < cos.length(); i++) {
            if (mapa.containsKey(cos.charAt(i))){
                mapa.put(cos.charAt(i),mapa.get(cos.charAt(i))+1);
            }
            else mapa.put(cos.charAt(i),1);
        }
        for (Map.Entry<Character,Integer> el:mapa.entrySet()
             ) {
            if (el.getValue()==3)
            System.out.println(el.getKey());
        }
    }
}
