package lekcje;

public class Animal {
    protected double waga;
    protected String imie;

    public Animal(double waga, String imie) {
        this.waga = waga;
        this.imie = imie;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "waga=" + waga +
                ", imie='" + imie + '\'' +
                '}';
    }
    public void dajGlos(){
        System.out.println("aauauuauauauau");
    }
}
