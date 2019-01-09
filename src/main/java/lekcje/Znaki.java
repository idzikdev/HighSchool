package lekcje;

import java.util.Scanner;

//BigIntegerMnozenie oblicza ilość @,% oraz # we wprowadzonym tekście.
public class Znaki {
  public static int [] metoda (String string){
   int [] tab=new int[3];
   for (int i = 0; i < string.length() ; i++) {
    switch (string.charAt(i)){
     case '@': tab[0]++;break;
     case '%': tab[1]++;break;
     case '#': tab[2]++;break;
    }
   }
   return tab;
  }

  public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   System.out.println("Podaj ciąg znaków");
   String string=scanner.nextLine();
   int [] wyniki={0,0,0};
   wyniki=metoda(string);
   System.out.println("@ = "+wyniki[0]);
   System.out.println("% = "+wyniki[1]);
   System.out.println("# = "+wyniki[2]);
  }
}
