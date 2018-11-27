package kolko;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Auto implements Comparable<Auto>{
    private String marka;
    private String model;
    private int rocznik;
    @ToString.Exclude
    private int przebieg;

    @Override
    public int compareTo(Auto o) {
       return this.getPrzebieg()-o.getPrzebieg();
    }
}
