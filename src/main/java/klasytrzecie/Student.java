package klasytrzecie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@NoArgsConstructor

public class Student {
    private String name;
    private String surname;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
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

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static int sumaCyfr(int wiek) {
        int result = 0;
        while (wiek > 0) {
            result = result + wiek % 10;
            wiek = wiek / 10;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Student s1 = new Student("Aacper", "Zajac", 18);
        Student s2 = new Student("Bacper", "Bugala", 16);
        Student s3 = new Student("Carolina", "Szyszkoo", 17);
        Student s4 = new Student("Carolina", "Szyszkoo", 17);
        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        //zadanie 1
        //Znajdź średnią wartość wieku wszystkich osób.
        System.out.println("Zadanie 1");
        list.stream()
                .mapToInt(student -> student.getAge())
                .average()
                .ifPresent(srednia -> System.out.println(srednia));

        //zadanie 2
        //Znajdź najstarszego człowieka i dopisz do jego imienia prefix Geek.
        System.out.println("Zadanie 2");
        list.stream()
                .max(Comparator.comparingInt(student -> student.getAge()))
                .ifPresent(student -> {
                    System.out.println("Geek " + student.getName());
                    System.out.println("Hello");
                });


        //zadanie 3
        // Utwórz nowego człowieka ze wszystkich ludzi w następujący sposób:
        // imię to pierwsze litery innych imion, KKK
        // nazwisko to ostatnie litery innych, CAO
        // wiek to suma lat pozostałych ludzi. 51
        System.out.println("Zadanie 3");
        list.stream()
                .map(s -> new Student(
                        s.getName().substring(0, 1),
                        s.getSurname().substring(s.getSurname().length() - 1, s.getSurname().length()),
                        s.getAge()
                ))
                .reduce((akumulator, i) -> new Student(
                        akumulator.getName() + i.getName(),
                        akumulator.getSurname() + i.getSurname(),
                        akumulator.getAge() + i.getAge()
                ))
                .ifPresent(student -> System.out.println(student));


        //zadanie 4
        //Utwórz listę lat ludzi na podstawie listy ludzi.
        System.out.println("Zadanie 4");
        Map<Integer, List<Student>> listMap = list.stream()
                .collect(Collectors.groupingBy(student -> student.getAge()));

        for (Map.Entry<Integer, List<Student>> element : listMap.entrySet()
        ) {
            System.out.println("W wieku " + element.getKey());
            System.out.println("są studenci " + element.getValue());
        }


        //Zadanie 5
        // Znajdź człowieka, którego suma cyfr
        //lat jest taka sama jak długość nazwiska.
        System.out.println("Zadanie 5");
        Predicate<Student> predicate = student -> student.getSurname().length() == sumaCyfr(student.getAge());
        list.stream()
                .filter(predicate)
                .forEach(student -> System.out.println(student));


        System.out.println("Zadanie 6");
        //Zadanie 6
        //Posortuj studentów malejąco po wieku.
        list.stream()
                .sorted((o1, o2) -> o1.getAge()-o2.getAge()*(-1))
                .forEach(student -> System.out.println(student));


        list.stream()
                .sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()) * (-1))
                .forEach(student -> System.out.println(student));



        System.out.println("Zadanie 7");
        //Podaj ilu jest studentów powtarzajacych się
        System.out.println(
                list.size()-list.stream()
                .distinct()
                .count());



        System.out.println("Zadanie 8");
        //  Na podstawie studentów utwórz klasę Animal : imię, wiek.
        //  Imie – złączenie imie i nazwisko studenta,
        //  a wiek to wiek podzielony przez 10
        list.stream()
                .map(student -> new Animal(
                        student.getName()+student.getSurname(),
                        student.getAge()/10
                ))
                .forEach(System.out::println);



         System.out.println("Zadanie 9");
        // Zamień wiek ludzi na psie lata n*6-2,
        // a następnie wyświetl tych ludzi,
        // których wiek po zamianie przekracza 50
        list.stream()
                .map(st->new Student(
                        st.getName(),
                        st.getSurname(),
                        st.getAge()*6-2
                ))
                .filter(st->st.getAge()>50)
                .forEach(System.out::println);



        System.out.println("Zadanie 10");
        //Zgrupuj ludzi,
        //których długość imienia i nazwiska jest taka sama
        Map<Integer, List<Student>> lista = list.stream()
                .collect(Collectors.groupingBy(st -> st.getName().length() + st.getSurname().length()));

        for (Map.Entry<Integer, List<Student>> element : lista.entrySet()
        ) {
            System.out.println("Długość " + element.getKey());
            System.out.println("mają studenci " + element.getValue());
        }


        System.out.println("Zadanie 11");
        // Zgrupuj wszystkich ludzi po nazwiskach.
        // Wyświetl najpopularniejsze nazwisko




        List<String> listaNazwisk = list.stream()
                .map(Student::getSurname)
                .collect(Collectors.toList());
        System.out.println(listaNazwisk);

        //TODO frequency


        //dodatkowe
        //zapisać do pliku liczby parzyste 2,1000
        IntStream.rangeClosed(2,1000)
                .filter(i->i%2==0)
                .sum();



    }
}
