package sprawdziany;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) throws IOException {
        List<String> list= Files.readAllLines(Paths.get("sprawdzian4.txt"));
        double liczba=0;
        for (String el:list
             ) {
            String [] wiersz=el.split(",");
            for (int i = 0; i < wiersz.length; i++) {
                if (wiersz[i].equals("1")){
                    liczba=liczba+Math.pow(2,i);
                }
            }
        }
        System.out.println(liczba);
    }
}
