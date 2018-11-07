package klasydrugie;

public class Zadanie18 {
    public static void main(String[] args) {
        int [] tablica={3,4,5,-1,0,4};
        int min=tablica[0];
        int max=tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i]<min) min=tablica[i];
            if (tablica[i]>max) max=tablica[i];
        }
        System.out.println("Element najmniejszy "+min);
        System.out.println("Element największy "+max);
    }
}
