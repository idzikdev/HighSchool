package poligon.funkcyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppStudent {
    public static void meet (List<Student> lista, Predicate<Student> predicate) {

        List<Student> result = new ArrayList<>();

        for (Student s : lista
        ) {
            if (predicate.test(s)){
                System.out.println(s);
            }

        }

    }

    public static void show(List<Student>list, String name){
        for (Student st:list
             ) {
            if (st.getName().equals(name)) System.out.println(st);
        }
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
        List<Student> list=new ArrayList<>(Arrays.asList(s1,s2,s3));

        Predicate<Student> predicateKasia= student -> student.getName().equals("Kasia");
        Predicate<Student> predicateWiek= student -> student.getAge()>30;

        meet(list,predicateKasia.and(predicateWiek));



//        Predicate<Student> predicateDaniel= student -> student.getName().equals("Daniel");
//

//        System.out.println(met(list,predicateKasia));

    }
}
