package klasytrzecie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        Book book1=new Book("Rambo","Cameron",1115,39.99);
        Book book2=new Book("Cobra","Sylwester",515,27.99);
        Book book3=new Book("Rambo-2","Locke",115,19.79);
        List<Book> bookList=new ArrayList<>();
        bookList.addAll(Arrays.asList(book1,book2,book3));
        System.out.println("Sortowanie po autorze");
        Collections.sort(bookList,Collections.reverseOrder());
        for (Book el:bookList
             ) {
            System.out.println(el);
        }
        System.out.println();
        System.out.println("Sortowanie po liczbie stron");
        Collections.sort(bookList,new CompPage());
        for (Book el:bookList
        ) {
            System.out.println(el);
        }
        System.out.println();
        System.out.println("Sortowanie po cenie");
        Collections.sort(bookList, new CompPrice());
        for (Book el:bookList) {
            System.out.println(el);
        }
        System.out.println();
        System.out.println("Sortowanie po tytule");
        Collections.sort(bookList, new CompTitle());
        for (Book el:bookList) {
            System.out.println(el);
        }
    }
}
