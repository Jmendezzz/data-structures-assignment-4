package comparable;

public class ComparableMethod {
  public static <T extends Comparable> T getTheLowest(T ...values) {
    T lowest = values[0];
    for (int i = 1; i < values.length; i++) {
      if (lowest.compareTo(values[i]) > 0) {
        lowest = values[i];
      }
    }

    return lowest;

  }
}