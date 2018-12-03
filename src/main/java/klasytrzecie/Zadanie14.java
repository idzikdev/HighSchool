package klasytrzecie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadanie14 {
    public static void main(String[] args) throws IOException {
        List<String> list1=Files.readAllLines(Paths.get("src/main/java/klasytrzecie/plik1.txt"));
        List<String> list2=Files.readAllLines(Paths.get("src/main/java/klasytrzecie/plik2.txt"));
        Set<String> set1=new HashSet<>(list1);
        Set<String> set2=new HashSet<>(list2);
        System.out.println("Zbiór A "+set1);
        System.out.println("Zbiór B "+set2);
        Set<String> wspolne=new HashSet<>(set1);
        wspolne.retainAll(set2);
        System.out.println("Zbiór AiB "+wspolne);
        Set<String> roznica=new HashSet<>(set1);
        roznica.removeAll(set2);
        System.out.println("Zbiór A-B "+roznica);
    }
}
