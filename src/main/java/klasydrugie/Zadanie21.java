package klasydrugie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj tekst");
        String string=scanner.nextLine();
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                case 'A': case 'E': case 'I': case 'O': case 'U': case 'Y':
                    if (map.containsKey(string.charAt(i))) map.put(string.charAt(i),map.get(string.charAt(i))+1);
                else map.put(string.charAt(i),1);break;
                default:;
            }
        }
        System.out.println(map);

    }
}
