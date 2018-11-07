package lekcje;

public class Sectoid extends Alien {
    private boolean mindControl;
    private String weapon;

    public Sectoid(int hp, double armor, boolean isAlive, int stamina, boolean mindControl, String weapon) {
        super(hp, armor, isAlive, stamina);
        this.mindControl = mindControl;
        this.weapon = weapon;
    }

    @Override
    public void zewKrwi() {
        System.out.println("Zaraz przejmę kontrolę nad twym umysłem. Uciekaj jesli zdążysz, a chyba nie!");
    }

    @Override
    public String toString() {
        return "Sectoid{" +
                "mindControl=" + mindControl +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
