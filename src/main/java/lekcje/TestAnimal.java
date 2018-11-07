package lekcje;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog=new Dog(30.14,"Rudy","kundel");
        Animal cat=new Cat(12.12,"Chomik",12);
        List<Animal> animalList=new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        for (Animal el:animalList
             ) {
            el.dajGlos();
        }
    }
}
