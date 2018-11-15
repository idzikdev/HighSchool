package lekcje;

public class Hanoi {

    public static void hanoi(int n, char A, char B, char C)
    {
        //z A na C (korzystając z B)
        if (n > 0)
        {
            hanoi(n-1, A, C, B);
            //System.out.println( A+" -> "+ C);
            hanoi(n-1, B, A, C);
        }
    }

    public static void main(String[] args) {
        long a=System.nanoTime();
        hanoi(30, 'A', 'B', 'C');
        long b=System.nanoTime();
        System.out.println((b-a)/1e9);
    }
}
