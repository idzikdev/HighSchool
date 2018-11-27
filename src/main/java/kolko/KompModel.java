package kolko;

import java.util.Comparator;

public class KompModel implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
      return o1.getModel().compareTo(o2.getModel());
    }
}
