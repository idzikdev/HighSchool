package poligon.funkcyjne;

import java.util.Arrays;
import java.util.List;

public class SumaKodowAscii {
    public static void main(String[] args) {
        List<String> imiona= Arrays.asList("Ala","Agata");
        System.out.println(
                imiona.stream()
                .map(s->s.toLowerCase())
                .mapToInt(s->s.chars().sum())
                .sum());
    }
}
