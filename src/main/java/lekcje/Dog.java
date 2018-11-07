package lekcje;

public class Dog extends Animal {
    private String rasa;

    public Dog(double waga, String imie, String rasa) {
        super(waga, imie);
        this.rasa = rasa;
    }

    @Override
    public void dajGlos() {
        //super.dajGlos();
        System.out.println("HAU HAU");
    }
}
