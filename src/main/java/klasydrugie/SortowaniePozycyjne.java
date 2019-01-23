package klasydrugie;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortowaniePozycyjne {
    public static void main(String[] args) {
        List<List<Integer>> kubelki=new ArrayList<>();
        List<Integer> result=new ArrayList<>(Arrays.asList(
                123,111,211,213,511,456,123,121
        ));
        List<Integer> kubelek0=new ArrayList<>();
        List<Integer> kubelek1=new ArrayList<>();
        List<Integer> kubelek2=new ArrayList<>();
        List<Integer> kubelek3=new ArrayList<>();
        List<Integer> kubelek4=new ArrayList<>();
        List<Integer> kubelek5=new ArrayList<>();
        List<Integer> kubelek6=new ArrayList<>();
        List<Integer> kubelek7=new ArrayList<>();
        List<Integer> kubelek8=new ArrayList<>();
        List<Integer> kubelek9=new ArrayList<>();
        kubelki.add(kubelek0);
        kubelki.add(kubelek1);
        kubelki.add(kubelek2);
        kubelki.add(kubelek3);
        kubelki.add(kubelek4);
        kubelki.add(kubelek5);
        kubelki.add(kubelek6);
        kubelki.add(kubelek7);
        kubelki.add(kubelek8);
        kubelki.add(kubelek9);

        // cyfra jedności
        for (Integer el:result
             ) {
            kubelki.get(el%10).add(el);
        }
        result.clear();
        // pobrac z kubełkow
         // wszystkie kubelki
        for (int i = 0; i < kubelki.size(); i++) {
            for (Integer el:kubelki.get(i)
                 ) {
             result.add(el);
            }
            kubelki.get(i).clear();
        }
        System.out.println("STAN "+result);
        // cyfra dziesiatek
        for (Integer el:result
        ) {
            kubelki.get(Integer.valueOf(String.valueOf(el).charAt(1)+"")).add(el);
        }
        result.clear();
        // pobrac z kubełkow
        // wszystkie kubelki
        for (int i = 0; i < kubelki.size(); i++) {
            for (Integer el:kubelki.get(i)
            ) {
                result.add(el);
            }
            kubelki.get(i).clear();
        }
        System.out.println("STAN "+result);
        // cyfra setek
        for (Integer el:result
        ) {
            kubelki.get(Integer.valueOf(String.valueOf(el).charAt(0)+"")).add(el);
        }
        result.clear();
        // pobrac z kubełkow
        // wszystkie kubelki
        for (int i = 0; i < kubelki.size(); i++) {
            for (Integer el:kubelki.get(i)
            ) {
                result.add(el);
            }
            kubelki.get(i).clear();
        }
        System.out.println("STAN "+result);
    }
}
