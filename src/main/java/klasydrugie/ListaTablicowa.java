package klasydrugie;

import java.util.*;

public class ListaTablicowa {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>(Arrays.asList(4,5,13));
        lista.add(10);
        lista.add(9);
        lista.add(14);
        lista.remove(Integer.valueOf(14));
        Collections.sort(lista);
        Iterator<Integer> it= lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer el:lista
        ) {
            System.out.println(el);
        }
    }
}
