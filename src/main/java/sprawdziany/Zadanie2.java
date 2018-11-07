package sprawdziany;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) throws IOException {
        Set<String> set=new LinkedHashSet<>();
        List<String> list= Files.readAllLines(Paths.get("sprawdzian2.txt"));
        List<Integer> lista=new ArrayList<Integer>();
        int ileLiczb=0;
        for (String el:list
                ) {
            String [] string=el.split(",");
            for (int i = 0; i < string.length ; i++) {
                set.add(string[i]);
                if (Character.isDigit(string[i].charAt(0))) {
                    ileLiczb++;
                    lista.add(Integer.valueOf(string[i]));
                }
            }
        }
        System.out.println("Liczb jest "+lista.size());
        boolean jest=false;
        int ile=1;
        for (int i = 0; i < lista.size()-1 ; i++) {
           if (lista.get(i+1)-lista.get(i)==1){
               jest=true;
               ile++;
           }
           else {
               ile=1;
           }
        }
        if (jest) System.out.println("TAK");
        else System.out.println("NIE");
    }
}
