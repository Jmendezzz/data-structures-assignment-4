package box;

public class Main {
  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<Integer>();
    Box<Double> doubleBox = new Box<Double>();
    Box<Float> floatBox = new Box<Float>();

    integerBox.add(7);
    doubleBox.add(66.6);
    floatBox.add(65f);

    System.out.println("Integer box = "+ integerBox.getValue());
    System.out.println("Double box = "+ doubleBox.getValue());
    System.out.println("Float box = "+ floatBox.getValue());
  }
}
