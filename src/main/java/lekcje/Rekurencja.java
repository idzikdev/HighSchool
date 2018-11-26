package lekcje;

public class Rekurencja {
    public static int metoda(int n){
        if (n==0) return 1;
        if (n==1) return 2;
        return metoda(n-1)+2*metoda(n-2);
    }
    public static void main(String[] args) {
        System.out.println(metoda(4));
    }
}
