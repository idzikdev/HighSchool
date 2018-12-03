package sprawdziany;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {
        Map<Character,Integer> mapa=new HashMap<>();
        List<String> lista= Files.readAllLines(Paths.get("src/main/java/sprawdziany/sprawdzian3.txt"));
        int sumaCyfr=0;
        for (String el:lista
             ) {
            String [] wiersz=el.split(",");
            for (int i = 0; i < wiersz.length; i++) {
              if (Character.isLetter(wiersz[i].charAt(0))) {
                  char znak=wiersz[i].charAt(0);
                  switch (znak){
                      case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                          break;
                      default:
                          if (mapa.containsKey(znak)) mapa.replace(znak,mapa.get(znak)+1);
                          else mapa.put(znak,1);
                  }
              }
              if (Character.isDigit(wiersz[i].charAt(0))){
                  sumaCyfr=sumaCyfr+Integer.valueOf(wiersz[i].charAt(0)+"");
              }
            }
            char maxEl=(char)mapa.keySet().toArray()[0];
            int max=1;
            for (Map.Entry<Character,Integer> znak:mapa.entrySet()
                 ) {
                if (znak.getValue()>max){
                    maxEl=znak.getKey();
                    max=znak.getValue();
                }
            }
            System.out.println("Suma cyfr "+sumaCyfr);
            System.out.println("Spółgłoska "+maxEl+" wystąpiła "+max+" razy czyli najczęściej");
        }
    }
}
