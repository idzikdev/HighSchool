package algorytmy;

import java.util.Collections;

public class BubbleSort {
    public static void main(String[] args) {
        int tab[]={1,5,4,-1,0,5,2};
        boolean zamiana=true;
        for (int m = 0; m < tab.length; m++) {
            if (zamiana)
            for (int i = 0; i < tab.length-1; i++) {
                    if (tab[i+1]<tab[i]){
                        int temp=tab[i+1];
                        tab[i+1]=tab[i];
                        tab[i]=temp;
                        zamiana=true;
                    }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
