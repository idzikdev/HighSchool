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
public class Person {
    private String name;
    private String surname;
    private int age;

    public static void main(String[] args) {
        Person p1=new Person("Kacper","Zając",18);
        Person p2=new Person("Kacper","Bugała",16);
        Person p3=new Person("Karolina","Szyszko",17);
        List<Person> list= Arrays.asList(p1,p2,p3);

        //zadanie 1
        list.stream()
                .mapToInt(person->person.getAge())
                .average()
                .ifPresent(s-> System.out.println(s));
        //zadanie 2
        list.stream()
                .max(Comparator.comparingInt(student->student.getAge()))
                .ifPresent(s -> System.out.println("Geek " + s.getName()));
        //zadanie 3
    }


}
