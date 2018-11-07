package lekcje;

import java.time.LocalDate;

public class Pracownik {
    private String name;
    private String surname;
    private int age;
    private double height;
    private boolean sex;
    private LocalDate date;

    public Pracownik(String name, String surname, int age, double height, boolean sex, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.sex = sex;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex=" + sex +
                ", date=" + date +
                '}';
    }
}

