package challenges;

public class Zadanie3 {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int value=0;
        for (int i = A.length-1; i >=0 ; i--) {
            value=value+A[i]*(int)Math.pow(10,i);
        }
        String string=String.valueOf(value);
        value=value*17;
        int sum=0;
        for (int i = 0; i < string.length() ; i++) {
            sum=sum+Integer.valueOf(string.charAt(i)+"");
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={3,5,1};
        System.out.println(solution(arr));

    }
}
