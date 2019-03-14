package klasytrzecie;

public class Strumienie2 {
    public static void main(String[] args) {
        int[] T = {6, 4, 1, 4, 1, 2, 5, 4, 4, 0, 5, 6, 6, 6};
        int n = T.length;
        int k = 6;
        int[] Z = new int[k+1];
        for (int i = 0; i <= k; i++) Z[i] = 0;
        for (int i = 0; i < n; i++) Z[T[i]] = Z[T[i]] + 1;
        int maks = Z[0], mini = Z[0];
        for (int i = 1; i <= k; i++) {
            if (mini == 0 && Z[i] != 0) mini = Z[i];
            else if (Z[i] != 0 && Z[i] < mini) mini = Z[i];
            if (Z[i] > maks) maks = Z[i];
        }
        System.out.println("Najczęściej");
        for (int i = 0; i <= k; i++)
            if (Z[i] == maks) System.out.println(i);
        System.out.println("Najrzadziej");
        for (int i = 0; i <= k; i++)
            if (Z[i] == mini) System.out.println(i);
    }
}
