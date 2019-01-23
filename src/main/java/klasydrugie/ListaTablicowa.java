package klasydrugie;

import java.util.*;

public class ListaTablicowa {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>(Arrays.asList(4,3,1,4));
        lista.add(10);
        lista.add(1);
        lista.add(2);
        lista.add(10);
        lista.add(0,12);
        lista.remove(Integer.valueOf(10));
        lista.remove(Integer.valueOf(10));
        Collections.sort(lista,Collections.reverseOrder());
        System.out.println(lista);
        for (Integer el:lista
             ) {
            System.out.println(el);
        }
        Iterator<Integer> it=lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
