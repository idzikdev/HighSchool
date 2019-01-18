package algorytmy;

import java.util.Stack;

public class StosLiczby {
    public static void main(String[] args) {
        Stack<Integer> stos = new Stack<>();
        int a = 134;
        while(a!=0){
            stos.push(a%2);
            a=a/2;
        }
        StringBuilder sb = new StringBuilder();
        while(!stos.empty()){
            sb.append(stos.pop());
        }
        System.out.println(sb);
    }
}
