import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort<T extends Comparable<? super T>> {
  T[] array;
  BubbleSort(T[] array){
    this.array = array;
  }
  
  private T[] bubbleSort(){
    for(int i = array.length; i > 1; i--){
      for(int j = 0; j < i - 1; j++){
        //if greater swap elements
        if(array[j].compareTo(array[j+1]) > 0){
        	 T temp = array[j];
        	 array[j] = array[j+1];
        	 array[j+1] = temp;  
        }
      }            
    }
    return array;
  }
  

  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int size = sc.nextInt();
    
    System.out.println("Enter the type of elements (1 for Integer, 2 for String): ");
    int type = sc.nextInt();
    
    if (type == 1) {
      Integer[] intArr = new Integer[size];
      System.out.println("Enter the array elements:");
      for (int i = 0; i < size; i++) {
        intArr[i] = sc.nextInt();
      }
      BubbleSort<Integer> bsg = new BubbleSort<>(intArr);
      Integer[] sortedArr = bsg.bubbleSort();
      System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    } else if (type == 2) {
      String[] strArr = new String[size];
      System.out.println("Enter the array elements:");
      for (int i = 0; i < size; i++) {
        strArr[i] = sc.next();
      }
      BubbleSort<String> bsg = new BubbleSort<>(strArr);
      String[] sortedArr = bsg.bubbleSort();
      System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    } else {
      System.out.println("Invalid type entered.");
    }
    
    sc.close();
  }
}