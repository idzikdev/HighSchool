package klasydrugie;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie20 {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<Integer>();
        Random random=new Random();
        while (set.size()!=6){
            set.add(random.nextInt(50)+1);
        }
        System.out.println("Wylosowane liczby to");
        System.out.println(set);
    }
}
