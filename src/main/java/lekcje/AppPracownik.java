package lekcje;

import java.util.Scanner;

public class AppPracownik {
    public static void mainMenu(){
        System.out.println("1-Zarządzenie pracownikami");
        System.out.println("2-Wyszukiwanie pracownika");
        System.out.println("3-Sortowanie pracowników");
        System.out.println("0-Zakończ program");
    }

    public static void menuPracownika(){
        System.out.println("1-Dodaj pracownika");
        System.out.println("2-Usuń pracowanika");
        System.out.println("3-Edytuj pracownika");
        System.out.println("0-Powrót");
    }
    public static void menuWyszukaj(){
        System.out.println("Menu wyszukiwania");
        //TODO dopisać logikę
    }

    public static void menuSortowanie(){
        System.out.println("Sortowanie pracowników");
        //TODO dopisać logikę
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string;
        do {
            mainMenu();
            string=scanner.nextLine();
            switch (string){
                case "1":menuPracownika();break;
                case "2":menuWyszukaj();break;
                case "3":menuSortowanie();break;
                default:
            }
        }
        while(!string.equals("0"));
    }
}
