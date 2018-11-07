package lekcje;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Losowanie {
    public static void losuj(int a,int b,int ile,int losowania){
        Set<Integer>set=new TreeSet<>();
        Random random=new Random();
        for (int i = 0; i < losowania; i++) {
            while (set.size()!=ile){
                set.add(random.nextInt(b-a+1)+a);
            }
            System.out.println(set);
            set.clear();
        }

    }
    public static void main(String[] args) {
        losuj(1,49,6,10);
    }
}
