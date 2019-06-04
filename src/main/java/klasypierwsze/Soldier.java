package klasypierwsze;

import java.util.Random;

public class Soldier {
    private String name;
    private String surname;
    private String nationality;
    private int age;
    public int stamina;
    public int damage;

    public Soldier(String name, String surname, String nationality, int age, int stamina, int damage) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.age = age;
        this.stamina = stamina;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", stamina=" + stamina +
                ", damage=" + damage +
                '}';
    }

    public void speak(){
        String [] screams={"Go West","Forza Inter","Freeze"};
        Random rnd=new Random();
        int randomScream=rnd.nextInt(screams.length);
        System.out.println(screams[randomScream]);
    }
}
