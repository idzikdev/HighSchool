package algorytmy;

public class WydawanieReszty {
    static int[] tab = {200, 100, 50, 20, 10, 5, 2, 1};
    static int[] tab2 = {6, 20, 13, 25, 100, 25, 80, 200};

    public static void main(String[] args) {
        int kwota = 2789;
        int counter=0;
        for (int i = 0; i < tab.length; i++) {
            counter=0;
            for (int j = 0; j < tab2[i]; j++) {
                if (kwota >= tab[i]) {
                    counter++;
                    kwota = kwota - tab[i];
                }
            }if (counter!=0)
            System.out.println("Wydałem "+counter+" banknotów "+tab[i]);
        }
    }
}

