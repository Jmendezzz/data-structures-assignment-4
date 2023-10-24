package printArray;

public class PrintArray {
  public static <T> void  printArray(T[] array){
    for(int i = 0; i<array.length;i++){
      System.out.println(array[i]);
    }

  }
}
