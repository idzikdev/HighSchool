package algorytmy;

public class WyszukiwanieBinarne {
    static int [] arr =new int[1000];
    static int x=222;
    static int counter=0;
    public static int wyszukaj(int l,int p){
        int n = (l+p)/2;
        counter++;
//        System.out.println("l =" + l);
//        System.out.println("p =" + p);
//        System.out.println("środkowy el =" + arr[n]);
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
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i*2;
        }
        System.out.println("Szukany element "+x+" jest na pozycji "+wyszukaj(0,arr.length-1));
        System.out.println("Srodek tablicy był obliczany "+counter+" razy");
    }
}
