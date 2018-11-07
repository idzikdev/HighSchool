package lekcje;

public class Cat extends Animal{
    private double damage;

    public Cat(double waga, String imie, double damage) {
        super(waga, imie);
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "damage=" + damage +
                ", waga=" + waga +
                ", imie='" + imie + '\'' +
                '}';
    }

    @Override
    public void dajGlos() {
//        super.dajGlos();
        System.out.println("Miał miał");
    }
}
