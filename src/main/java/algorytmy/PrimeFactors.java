package algorytmy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static long [] returnPrimeNumbers(long n){
        long [] result=new long[(int)n];
        for (int i = 0; i < result.length; i++) {
            result[i]=1;
        }
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            for (int j = 2*i; j < result.length; j=j+i) {
                if (result[j]==1)result[j]=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        long tab [] = returnPrimeNumbers(number);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < tab.length; i++)
        {
            if(tab[i]==1)
            list.add(i);
        }
        List<Integer> primeFactors = new LinkedList<Integer>();
        int i = 0;
        while(number!=1)
        {
            while(number%list.get(i)==0)
            {
                number /= list.get(i);
                primeFactors.add(list.get(i));
            }
            i++;
        }
        System.out.println(primeFactors);
    }
}
