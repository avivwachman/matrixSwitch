
import java.util.Arrays;

public class que9 {

  public static void main(String[] args) {
    int[][] m = {
      {1,  2,  3,  4},
      {5,  6,  7,  8},
      {9,  10, 11, 12},
      {13, 14, 15, 16}
    };
    System.out.println(isAboveMore(m));
    printArr(m);
  }

  public static boolean isAboveMore (int arr[][]){
    boolean isMore = false;

    int aboveSum = 0, belowSum = 0;
    for (int row = 0; row < arr.length; row++) {
      for (int col = row+1; col < arr[row].length; col++) {
        aboveSum += arr[row][col];
        belowSum += arr[col][row];
      }
    }
    if (aboveSum < belowSum){
      int temp;
      for (int row = 0; row < arr.length; row++) {
        for (int col = row+1; col < arr[row].length; col++) {
          temp = arr[row][col];
          arr[row][col] = arr[col][row];
          arr[col][row] = temp;
        }
      }
      return false;
    }
    return true;
  }


  public static void printArr(int[][] arr) {  //print the matrix

    for (int row = 0; row < arr.length; row++) { //print
      System.out.println(Arrays.toString(arr[row]));
    }
    System.out.println();
  }

}
