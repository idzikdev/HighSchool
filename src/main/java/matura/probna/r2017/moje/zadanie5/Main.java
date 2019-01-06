package matura.probna.r2017.moje.zadanie5;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static int toInt(String value){
        double result=0;
        for (int i = 0; i < value.length() ; i++) {
            if (value.charAt(i)=='1'){
                result=result+Math.pow(2,value.length()-1-i);
            }
        }
        return (int)result;
    }
    public static Czas toCzas(String s){
        int G1=toInt(s.substring(0,4));
        int G2=toInt(s.substring(4,8));
        int M1=toInt(s.substring(8,12));
        int M2=toInt(s.substring(12,16));
        int S1=toInt(s.substring(16,20));
        int S2=toInt(s.substring(20,24));
        return new Czas(G1+""+G2,M1+""+M2,S1+""+S2);
    }
    public static void main(String[] args) throws IOException {
        List<String> plik=Files.readAllLines(Paths.get("src/main/java/matura/probna/r2017/dane/rejestrator.txt"));
        List<Czas> czasList=new ArrayList<>();
        PrintWriter wyniki5=new PrintWriter("src/main/java/matura/probna/r2017/moje/wyniki5.txt");
        for (String s:plik
             ) {
           czasList.add(toCzas(s));
        }
        // Zadanie 5.1
        System.out.println("Zadanie 5.1");
        System.out.println("Zarejestrowane czasy");
        for (Czas czas:czasList
             ) {
            System.out.println(czas);
        }
        wyniki5.println(czasList.get(1110));
        wyniki5.println(czasList.get(2221));
        wyniki5.println(czasList.get(3332));
        wyniki5.println(czasList.get(4443));
        wyniki5.close();
        System.out.println("Zarejestowany czas we wpisie o nr 1111= "+czasList.get(1110));
        System.out.println("Zarejestowany czas we wpisie o nr 2222= "+czasList.get(2221));
        System.out.println("Zarejestowany czas we wpisie o nr 3333= "+czasList.get(3332));
        System.out.println("Zarejestowany czas we wpisie o nr 4444= "+czasList.get(4443));
        // Zadanie 5.2
        System.out.println("Zadanie 5.2");
        System.out.println("Palindromiczne wskazania zegara");
        int counter=0;
        for (Czas czas:czasList
             ) {
            if (czas.isPalindrom()){
                System.out.println(czas);
                counter++;
            }
        }
        System.out.println(counter);
        // Zadanie 5.3
        System.out.println("Zadanie 5.3");
        Collections.sort(czasList);
        Czas czas1=new Czas("12","00","00");
        Czas czas2=new Czas("12","15","00");
        Map<Czas,Integer> mapa=new TreeMap<>();
        for (Czas czas:czasList
             ) {
            if (czas.compareTo(czas1)>=0&&czas.compareTo(czas2)<=0){
                if (mapa.containsKey(czas)){
                    mapa.put(czas,mapa.get(czas)+1);
                }
                else
                    mapa.put(czas,1);
            }
        }
        for (Map.Entry<Czas,Integer> el:mapa.entrySet()
             ) {
            if (el.getValue()==3) System.out.println(el.getKey());
        }
        // Zadanie 5.4
        System.out.println("Zadanie 5.4");
        int [] godziny=new int[25];
        for (Czas czas:czasList
             ) {
            godziny[Integer.valueOf(czas.getGG())%24]+=1;
    }
        for (int i = 0; i < godziny.length; i++) {
            if (godziny[i]>0)System.out.println(i+"="+godziny[i]);
        }
    }
}
