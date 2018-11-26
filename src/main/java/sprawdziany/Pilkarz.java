package sprawdziany;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pilkarz implements Comparable<Pilkarz> {
    private String name;
    private String surname;
    private int wiek;
    @ToString.Exclude
    private String klub;
    @Override
    public int compareTo(Pilkarz o) {
        return Integer.compare(this.getWiek(),o.getWiek());
    }
}
