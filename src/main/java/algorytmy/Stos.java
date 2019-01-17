package algorytmy;

import java.util.Stack;

public class Stos {
    public static void main(String[] args) {
        Stack<Integer> stos=new Stack<>();
        int n = 30;
        StringBuilder x = new StringBuilder();
        while(n!=0){
            if(n%2==0){
                stos.push(0);
                n/=2;
            }else{
                stos.push(1);
                n/=2;
            }
        }
        while (!stos.empty()){
            x.append(stos.pop());
        }
        System.out.println(x);
    }
}
