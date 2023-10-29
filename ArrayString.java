import java.util.Scanner;
public class ArrayString {
  public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    int[][] array = new int[2][3];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = sca.nextInt();
      }
    }
    System.out.println("The 2D array is:");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("The maximum value in the 2D array is:");
    int max = array[0][0];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
        }
      }
    }
    System.out.println(max);
    System.out.println("The minimum value in the 2D array is:");
    int min = array[0][0];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] < min) {
          min = array[i][j];
        }
      }
    }
    System.out.println(min);
    System.out.println("The sum of all the elements in the 2D array is:");
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        sum += array[i][j];
      }
    }
    System.out.println(sum);
    System.out.println("The average of all the elements in the 2D array is:");
    float average = (float) sum / (array.length * array[0].length);
    System.out.println(average);
    System.out.println("The search result for the given string in the 2D array is:");
    String searchString = sca.next();
    boolean found = false;
    for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
        if (String.valueOf(array[i][j]).equals(searchString)) {
        found = true;
    System.out.println("The string \"" + searchString + "\" is found at row " + i + ", column " + j + ".");
        }
   }
    }
    if (!found) {
      System.out.println("The string \"" + searchString + "\" is not found in the 2D array.");
    }
  }
}
