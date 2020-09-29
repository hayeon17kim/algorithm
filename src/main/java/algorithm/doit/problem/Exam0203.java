package algorithm.doit.problem;

public class Exam0203 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(sumOf(arr));
  }
  
  static int sumOf(int[] a) {
    int result = 0; 
    for (int value : a)
      result += value;
    return result;
  }
}
