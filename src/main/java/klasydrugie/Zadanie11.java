package klasydrugie;

import java.util.Random;

public class Zadanie11 {
    public static void main(String[] args) {
        Random random=new Random();
        int [][] tablica=new int[3][3];
        int suma=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablica[i][j]=random.nextInt(90)+10;
                System.out.print("---"+tablica[i][j]);
                if (j>i) suma=suma+tablica[i][j];
            }
            System.out.println();
        }
        System.out.println("Suma = "+suma);

    }
}
