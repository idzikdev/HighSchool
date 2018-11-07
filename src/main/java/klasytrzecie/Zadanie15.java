package klasytrzecie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie15 {
    public static void main(String[] args) {
        Integer [] tab={4,14,5,0,1,13};
        Set<Integer> set=new TreeSet<Integer>(Arrays.asList(tab));
        System.out.println(set);

    }
}
