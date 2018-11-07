package klasytrzecie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string;
        String word;
        Map<String,String> mapPolishToEnglish=new HashMap<String, String>();
        Map<String,String> mapEnglishToPolish=new HashMap<String, String>();
        mapPolishToEnglish.put("kot","cat");
        mapPolishToEnglish.put("pies","dog");
        mapPolishToEnglish.put("lalka","doll");
        mapEnglishToPolish.put("cut","ciąć, redukcja, obniżka");
        mapEnglishToPolish.put("home","dom, schronisko");
        mapEnglishToPolish.put("place","lokal, mieszkanie");
        do {
            System.out.println("Menu");
            System.out.println("1-Tłumaczenie Polski-Angielski.");
            System.out.println("2-Tłumaczenie Angielski-Polski.");
            System.out.println("0-Wyjście.");
            string=scanner.nextLine();
            if (string.equals("1")){
                System.out.println("Podaj polskie słowo");
                word=scanner.nextLine();
                if (mapPolishToEnglish.containsKey(word))
                    System.out.println("Tłumacznie : "+mapPolishToEnglish.get(word));
                else System.out.println("Brak słowa w słowniku.");
            }
            if (string.equals("2")){
                System.out.println("Podaj angielskie słowo");
                word=scanner.nextLine();
                if (mapEnglishToPolish.containsKey(word))
                    System.out.println("Tłumacznie : "+mapEnglishToPolish.get(word));
                else System.out.println("Brak słowa w słowniku.");
            }
        }
        while(!string.equals("0"));

    }
}
