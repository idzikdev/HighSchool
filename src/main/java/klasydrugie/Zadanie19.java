package klasydrugie;

public class Zadanie19 {
    public static void main(String[] args) {
        int [] tablica={4,3,4,5,4,3,2,1,-1,0};
        int counter=0;
        int k=3;
        for (int i = 0; i < tablica.length; i++) {
            if (k==tablica[i]) counter++;
        }
        System.out.println("Liczba "+k+" wystąpiła "+counter+" razy");
    }
}
