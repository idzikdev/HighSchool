package lekcje;

import java.util.ArrayList;
import java.util.List;

public class TestAlien {
    public static void main(String[] args) {
        Alien animal=new Alien(100,100,true,100);
        Alien sectoid=new Sectoid(100,100,true,100,true,"Heavy Plasma");
        List<Alien> alienList=new ArrayList<>();
        alienList.add(animal);
        alienList.add(sectoid);
        for (Alien el:alienList
             ) {
            if (el instanceof Sectoid){
                System.out.println("To jest sektoid");
                ((Alien)el).zewKrwi();
            }
            if (el instanceof Alien){
                System.out.println("To jest alien");
            }
            System.out.println(el);
            el.zewKrwi();
        }
    }
}
