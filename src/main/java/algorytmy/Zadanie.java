package algorytmy;

public class Zadanie {
    public static int nwd(int a,int b){
        if(a>b)return nwd(a-b,b);
        if(b>a)return nwd(b,b-a);
        return a;
    }
    public static void main(String[] args) {
        int a=35;
        int b=7;
        System.out.println(nwd(a,b));
    }
}
