package sprawdziany;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPilkarz {
    public static void main(String[] args) throws IOException {
        List<String>stringList= Files.readAllLines(Paths.get("src/main/java/sprawdziany/pilkarze.txt"));
        System.out.println(stringList);
        List<Pilkarz>pilkarzList=new ArrayList<>();
        for (String el:stringList
             ) {
            String [] danePilkarza=el.split(",");
            pilkarzList.add(
                    new Pilkarz(
                            danePilkarza[0],
                            danePilkarza[1],
                            Integer.valueOf(danePilkarza[2]),
                            danePilkarza[3]
                            )
            );
        }
        System.out.println(pilkarzList);
        Collections.sort(pilkarzList);
        System.out.println(pilkarzList.get(pilkarzList.size()-1));
        for (Pilkarz el:pilkarzList
             ) {
            if (el.getKlub().equals("Juventus")){
                System.out.println("Gra w nim "+el);
            }
        }
    }
}
