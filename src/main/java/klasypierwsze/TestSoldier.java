package klasypierwsze;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class TestSoldier {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter file = new PrintWriter("fight.txt");
        Soldier soldier1 = new Soldier("Jan",
                "Kowalski", "Polish",
                31, 90, 12);

        Soldier soldier2 = new Soldier("Jacek", "Placek", "Polish"
                , 30, 87, 90);
        Random rnd = new Random();
        int rndDamage = 0;
        int rndStamina = 0;
        file.println("S1. ("+soldier1.damage+","+soldier1.stamina+") ------- VS ------- "+"S2. ("+soldier2.damage+","+soldier2.stamina+")");
        file.println("Walka się rozpoczyna");
        while (soldier1.stamina > 0 && soldier2.stamina > 0) {
            if (soldier1.stamina>0){
                if (soldier1.damage>soldier2.damage)
                rndDamage = rnd.nextInt(Math.abs(soldier1.damage-soldier2.damage));
                else
                    rndDamage=rnd.nextInt(soldier1.damage);
//                file.println("Soldier 1 atakuje Soldiera 2 z siłą " + rndDamage + " punktów");
//                file.println("S1. ("+soldier1.damage+","+soldier1.stamina+") ------- VS ------- "+"S2. ("+soldier2.damage+","+soldier2.stamina+")");
                if (soldier2.stamina > rndDamage) {
                    soldier2.stamina = soldier2.stamina - rndDamage;
//                    file.println("Soldier 2 dostaje obrażenia");
//                    file.println("S1. ("+soldier1.damage+","+soldier1.stamina+") ------- VS ------- "+"S2. ("+soldier2.damage+","+soldier2.stamina+")");
                } else {
                    soldier2.stamina = 0;
                }
            }
            file.println("S1. ("+soldier1.damage+","+soldier1.stamina+") ------- VS ------- "+"S2. ("+soldier2.damage+","+soldier2.stamina+")");

            if (soldier2.stamina > 0) {
                if (soldier2.damage>soldier1.damage)
                    rndDamage = rnd.nextInt(Math.abs(soldier2.damage-soldier1.damage));
                else
                    rndDamage=rnd.nextInt(soldier2.damage);
//                file.println("Soldier 2 atakuje Soldiera 1 z siłą " + rndDamage + " punktów");
//                file.println("S1. ("+soldier1.damage+","+soldier1.stamina+") ------- VS ------- "+"S2. ("+soldier2.damage+","+soldier2.stamina+")");
                if (soldier1.stamina > rndDamage) {
                    soldier1.stamina = soldier1.stamina - rndDamage;
//                    file.println("Soldier 1 dostaje obrażenia");
//                    file.println("S1. ("+soldier1.damage+","+soldier1.stamina+") ------- VS ------- "+"S2. ("+soldier2.damage+","+soldier2.stamina+")");
                } else
                    soldier1.stamina = 0;
            }
        }
        file.println("S1. ("+soldier1.damage+","+soldier1.stamina+") ------- VS ------- "+"S2. ("+soldier2.damage+","+soldier2.stamina+")");
        if (soldier1.stamina==0){
            file.println("Wygrał Soldier 2");
        }
        else if (soldier2.stamina==0) file.println("Wygrał Soldier 1");
        else System.out.println("OBAJ PRZEGRALI");
        file.println("Soldier 1. Attack "+soldier1.damage+" Obrona "+soldier1.stamina);
        file.println("Soldier 2. Attack "+soldier2.damage+" Obrona "+soldier2.stamina);
        file.println("Walka się zakończyła");
        file.close();
    }
}
