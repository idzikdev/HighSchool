package poligon.funkcyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppStudent {
    public static List<Student> met (List<Student> lista, Predicate<Student> predicate) {

        List<Student> result = new ArrayList<>();

        for (Student s : lista
        ) {
            if (predicate.test(s)){
                result.add(s);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Student s1=Student.builder()
                .name("Kasia")
                .surname("Kasiowska")
                .age(34)
                .build();
        Student s2=Student.builder()
                .name("Daniel")
                .surname("Danielowski")
                .age(21)
                .build();
        Student s3=Student.builder()
                .name("Kasia")
                .surname("Tatara")
                .age(23)
                .build();
        Predicate<Student> predicateKasia= student -> student.getName().equals("Kasia");
        Predicate<Student> predicateDaniel= student -> student.getName().equals("Daniel");

        List<Student> list=new ArrayList<>(Arrays.asList(s1,s2,s3));
        System.out.println(met(list,predicateKasia));

    }
}
