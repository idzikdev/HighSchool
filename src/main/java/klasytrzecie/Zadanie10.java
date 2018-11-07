package klasytrzecie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Zadanie10 {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list=new ArrayList<>();
        int tester;
        for (int i = 0; i < 1e5; i++) {
            list.add(random.nextInt(100));
        }
        // FOR
        long start1=System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            tester=list.get(i);
        }
        long stop1=System.nanoTime();
        // FOREACH
        long start2=System.nanoTime();
        for (Integer integer : list) {
            tester=integer;
        }
        long stop2=System.nanoTime();
        // ITERATOR
        long start3=System.nanoTime();
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            tester=iterator.next();
        }
        long stop3=System.nanoTime();
        System.out.println("FOR      "+(stop1-start1)+" nanosekund");
        System.out.println("FOREACH  "+(stop2-start2)+" nanosekund");
        System.out.println("ITERATOR "+(stop3-start3)+" nanosekund");
    }
}
