package lekcje;

public class Minimum {
    public static int minimum(int [] tab){
        int min=tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i]<min)min=tab[i];
        }
        return min;
    }
    public static int maximum(int [] tab){
        int max=tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i]>max)max=tab[i];
        }
        return max;
    }
    public static int [] oblicz(int [] tab){
        int [] result={tab[0],tab[0]};
        for (int i = 1; i < tab.length; i++) {
            if (tab[i]<result[0])result[0]=tab[i];
            if (tab[i]>result[1])result[1]=tab[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] tab={4,3,-1,13,0,0,5};
        System.out.println("Min "+oblicz(tab)[0]);
        System.out.println("Min "+oblicz(tab)[1]);
    }
}
