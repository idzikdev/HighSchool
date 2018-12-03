package sprawdziany;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        Set<Integer> set=new HashSet<Integer>();
        List<String> list= Files.readAllLines(Paths.get("src/main/java/sprawdziany/sprawdzian1.txt"));
        for (String el:list
             ) {
           String [] string=el.split(",");
            for (int i = 0; i < string.length ; i++) {
                set.add(Integer.valueOf(string[i]));
            }
        }
        int a,b,c;
        for (Integer integera:set
             ) {
            a=integera;
            for (Integer integerb:set
                 ) {
                b=integerb;
                for (Integer integerc:set
                     ) {
                    c=integerc;
                    if ((a*100+b*10+c)%3==0){
                        System.out.println(new ArrayList<>(Arrays.asList(a,b,c)));
                    }
                }
            }
        }
    }
}
