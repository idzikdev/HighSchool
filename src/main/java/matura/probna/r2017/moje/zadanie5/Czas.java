package matura.probna.r2017.moje.zadanie5;

public class Czas implements Comparable<Czas>{
    private String GG;
    private String MM;
    private String SS;

    public Czas(String GG, String MM, String SS) {
        this.GG = GG;
        this.MM = MM;
        this.SS = SS;
    }
    public boolean isPalindrom(){
        String string=GG+MM+SS;
        if (new StringBuilder(string).reverse().toString().equals(string)) return true;
        return false;
    }
    @Override
    public String toString() {
        return GG+":"+MM+":"+SS;
    }

    public String getGG() {
        return GG;
    }

    public void setGG(String GG) {
        this.GG = GG;
    }

    public String getMM() {
        return MM;
    }

    public void setMM(String MM) {
        this.MM = MM;
    }

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS;
    }

    @Override
    public int compareTo(Czas o) {
        int g1=Integer.valueOf(this.getGG());
        int m1=Integer.valueOf(this.getMM());
        int s1=Integer.valueOf(this.getSS());
        int g2=Integer.valueOf(o.getGG());
        int m2=Integer.valueOf(o.getMM());
        int s2=Integer.valueOf(o.getSS());
        if (g1<g2) return -1;
        else if (g2<g1) return 1;
        else if (m1<m2) return -1;
        else if (m2<m1) return 1;
        else if (s1<s2) return -1;
        else if (s2<s1) return 1;
        return 0;
    }
}
