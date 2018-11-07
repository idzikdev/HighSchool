package lekcje;

public class Alien {
  private int hp;
  private double armor;
  private boolean isAlive;
  private int stamina;

    public Alien(int hp, double armor, boolean isAlive, int stamina) {
        this.hp = hp;
        this.armor = armor;
        this.isAlive = isAlive;
        this.stamina = stamina;
    }
    public void zewKrwi(){
        System.out.println("aaaauuuuuuu");
    }

    protected int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Jestem zwierzem{" +
                "hp=" + hp +
                ", armor=" + armor +
                ", isAlive=" + isAlive +
                ", stamina=" + stamina +
                '}';
    }
}
