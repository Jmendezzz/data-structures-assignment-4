package printArray;

public class Main {
  public static void main(String[] args) {
    String[] stringArray = {"Hola", "Mundo", "Genericos"};
    Integer[] integerArray = {1,2,3,4,5};

    System.out.println("Array de Strings:");
    PrintArray.printArray(stringArray);
    System.out.println("Array de Integers");
    PrintArray.printArray(integerArray);
  }
}
