package klasytrzecie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private String surname;
    private int age;

    public static void main(String[] args) {
        Student s1=new Student("Kacper","Zając",18);
        Student s2=new Student("Kacper","Bugała",16);
        Student s3=new Student("Karolina","Szyszko",17);
        List<Student> list= Arrays.asList(s1,s2,s3);

        //zadanie 1
        //Znajdź średnią wartość wieku wszystkich osób.
        list.stream()
                .mapToInt(taboret->taboret.getAge())
                .average()
                .ifPresent(cos-> System.out.println(cos));


        //zadanie 2


        //Znajdź najstarszego człowieka i dopisz do jego imienia prefix Geek.


        //zadanie 3
        // Utwórz nowego człowieka ze wszystkich ludzi w następujący sposób:
        // imię to pierwsze litery innych, KKK
        // nazwisko to ostatnie litery innych, CAO
        // wiek to suma lat pozostałych ludzi. 53
//        list.stream()
//        .map(s -> new Person()
//                .builder()
//                .name(s.getName().substring(0, 1))
//                .surname(s.getSurname().substring(0, 1))
//                .age(s.getAge()).build())
//                .reduce((s, i) -> new Person()
//                        .builder()
//                        .name(s.getName() + i.getName().charAt(i.getName().length() - 1))
//                        .surname(s.getSurname() + s.getName().charAt(i.getSurname().length() - 1))
//                        .age(s.getAge() + i.getAge())
//                        .build())
//                .ifPresent(s -> System.out.println(s));
    }


}
