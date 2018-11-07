package klasytrzecie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie12 {
    public static boolean isRepeatable(List<String> lista){
        int i=0;
        while(!lista.isEmpty()){
            String element=lista.get(i);
            lista.remove(i);
            if (lista.contains(element)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mysz");
        list.add("świnka");
        list.add("mysz");
        list.add("chomik");
        list.add("pies");
        list.add("mysz");
        if (isRepeatable(list)) System.out.println("Są elementy powtarzające się!");
        else System.out.println("Nie ma elementów powtarzających się");
    }
}
