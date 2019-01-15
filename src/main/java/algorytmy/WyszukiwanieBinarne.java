package algorytmy;

public class WyszukiwanieBinarne {
    static int [] arr = {1,3,4,5,6,8,9,10,15,22,34};
    static int x=22;
    public static int wyszukaj(int l,int p){
        int n = (l+p)/2;
        System.out.println("l =" + l);
        System.out.println("p =" + p);
        System.out.println("środkowy el =" + arr[n]);
        if(p<l){
            return -1;
        }
        if(arr[n]==x){
            return n;
        }
        else if (arr[n]>x){
            return wyszukaj(l,n-1);
        }

        else{
            return wyszukaj(n+1,p);
        }

    }
    public static void main(String[] args) {
        System.out.println(wyszukaj(0,arr.length-1));
    }
}
