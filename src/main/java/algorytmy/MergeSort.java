package algorytmy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(2,4,5,6,8));
        List<Integer> list2=new ArrayList<>(Arrays.asList(1,3,5,7,8));
        List<Integer> list3=new ArrayList<>();
        while (list1.size()>0 || list2.size()>0){
            if (list1.size()>0 && list2.size()==0){
                list3.addAll(list1);
                list1.clear();
            }
            else if (list2.size()>0 && list1.size()==0){
                list3.addAll(list2);
                list2.clear();
            }
            else if (list1.size()>0 && list2.size()>0){
                if (list1.get(0)>list2.get(0)){
                    list3.add(list2.get(0));
                    list2.remove(0);
                }
                else{
                    list3.add(list1.get(0));
                    list1.remove(0);
                }
            }
            else {
                break;
            }
        }
        System.out.println(list3);
    }
}
