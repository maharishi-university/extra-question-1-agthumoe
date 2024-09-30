import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] tmp = new int[] { 2, 7, 11, 15 };
    System.out.println(Arrays.toString(getIndices(tmp, 9)));
  }

  public static int[] getIndices(int[] inputs, int target) {
    for (int i = 0; i < inputs.length; i++) {
      for (int j = 0; j < inputs.length; j++) {
        if (i == j) {
          continue;
        }
        if (inputs[i] + inputs[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return null;
  }
}