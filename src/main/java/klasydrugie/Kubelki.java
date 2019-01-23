package klasydrugie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kubelki {
    public static void main(String[] args) {
        List<Integer> results=new ArrayList<Integer>(Arrays.asList(
                123,111,211,213,511,456,123,121
        ));
        List<List<Integer>> kubelki=new ArrayList<>();
        List<Integer> kubelek0=new ArrayList<>();kubelki.add(kubelek0);
        List<Integer> kubelek1=new ArrayList<>();kubelki.add(kubelek1);
        List<Integer> kubelek2=new ArrayList<>();kubelki.add(kubelek2);
        List<Integer> kubelek3=new ArrayList<>();kubelki.add(kubelek3);
        List<Integer> kubelek4=new ArrayList<>();kubelki.add(kubelek4);
        List<Integer> kubelek5=new ArrayList<>();kubelki.add(kubelek5);
        List<Integer> kubelek6=new ArrayList<>();kubelki.add(kubelek6);
        List<Integer> kubelek7=new ArrayList<>();kubelki.add(kubelek7);
        List<Integer> kubelek8=new ArrayList<>();kubelki.add(kubelek8);
        List<Integer> kubelek9=new ArrayList<>();kubelki.add(kubelek9);
        // jedności
        for (Integer el:results
             ) {
            kubelki.get(el%10).add(el);
        }
        results.clear();
        for (List<Integer> lista:kubelki
             ) {
            for (Integer el:lista
                 ) {
                results.add(el);
            }
            lista.clear();
        }
        System.out.println("----------------");
        System.out.println("Kubelki");
        for (List<Integer> lista:kubelki
             ) {
            System.out.println(lista);
        }
        System.out.println("Results");
        System.out.println(results);
        //dziesiątki
        for (Integer el:results
        ) {
            kubelki.get((el/10)%10).add(el);
        }
        results.clear();
        for (List<Integer> lista:kubelki
        ) {
            for (Integer el:lista
            ) {
                results.add(el);
            }
            lista.clear();
        }
        System.out.println("----------------");
        System.out.println("Kubelki");
        for (List<Integer> lista:kubelki
        ) {
            System.out.println(lista);
        }
        System.out.println("Results");
        System.out.println(results);
        //setki
        for (Integer el:results
        ) {
            kubelki.get(el/100).add(el);
        }
        results.clear();
        for (List<Integer> lista:kubelki
        ) {
            for (Integer el:lista
            ) {
                results.add(el);
            }
            lista.clear();
        }
        System.out.println("----------------");
        System.out.println("Kubelki");
        for (List<Integer> lista:kubelki
        ) {
            System.out.println(lista);
        }
        System.out.println("Results");
        System.out.println(results);
    }
}
