package matura.probna.r2017.moje.zadanie4;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> punkty=Files.readAllLines(Paths.get("src/main/java/matura/probna/r2017/dane/punkty.txt"));
        List<String> okregi=Files.readAllLines(Paths.get("src/main/java/matura/probna/r2017/dane/okregi.txt"));
        PrintWriter wyniki1=new PrintWriter("src/main/java/matura/probna/r2017/moje/wyniki1.txt");
        PrintWriter wyniki2=new PrintWriter("src/main/java/matura/probna/r2017/moje/wyniki2.txt");
        PrintWriter wyniki3=new PrintWriter("src/main/java/matura/probna/r2017/moje/wyniki3.txt");
        List<Punkt> listOfPunkty=new ArrayList<>();
        for (String s:punkty
             ) {
            String [] tab=s.split(" ");
            listOfPunkty.add(new Punkt(Double.valueOf(tab[0]),Double.valueOf(tab[1])));
        }
        List<Okrag> listOfOkregi=new ArrayList<>();
        for (String s:okregi
        ) {
            String [] tab=s.split(" ");
            listOfOkregi.add(new Okrag(Double.valueOf(tab[0]),Double.valueOf(tab[1]),Double.valueOf(tab[2])));
        }
        // Zadanie 4.1
        int pierwsza=0;
        int druga=0;
        int trzecia=0;
        int czwarta=0;
        for (Punkt p:listOfPunkty
             ) {
            switch (p.ktoraCwiartka()){
                case 1:pierwsza++;break;
                case 2:druga++;break;
                case 3:trzecia++;break;
                case 4:czwarta++;break;
            }
        }
        wyniki1.print(pierwsza+" "+druga+" "+trzecia+" "+czwarta);
        wyniki1.close();
        System.out.println("Zadanie 4.1");
        System.out.println(pierwsza+" "+druga+" "+trzecia+" "+czwarta);
        // Zadanie 4.2
        List<Okrag> okregiStyczne=new ArrayList<>();
        for (Okrag o:listOfOkregi
             ) {
            if (o.czyStyczny()) okregiStyczne.add(o);
        }
        Collections.sort(okregiStyczne);
        for (Okrag o:okregiStyczne
             ) {
            wyniki2.print(o);
        }
        wyniki2.print(okregiStyczne.size());
        wyniki2.close();
        System.out.println("Zadanie 4.2");
        System.out.println(okregiStyczne.size());
        // Zadanie 4.3
        List<Trojkat> listOfTrojkat=new ArrayList<>();
        for (int i = 0; i < listOfPunkty.size()-3; i++) {
            listOfTrojkat.add(new Trojkat(listOfPunkty.get(i),listOfPunkty.get(i+1),new Punkt(0,0)));
        }
        double pole=0;
        for (Trojkat t:listOfTrojkat
             ) {
            pole=pole+t.pole();
        }
        wyniki3.print(pole);
        wyniki3.close();
        System.out.println("Zadanie 4.3");
        System.out.println((int)pole);
    }
}
