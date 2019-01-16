package algorytmy;

public class SelectionSort {
    public static void main(String[] args) {
        int tab[]={1,5,4,-1,0,5,2};
        for (int i = 0; i < tab.length-1; i++) {
            int min=i+1;
            for (int j = i+2; j < tab.length; j++) {
                if (tab[j]<tab[min]){
                    min=j;
                }
            }
            if (tab[min]<tab[i]){
                int temp=tab[min];
                tab[min]=tab[i];
                tab[i]=temp;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
