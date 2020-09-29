package algorithm.doit.problem;

public class Exam0205 {
  
  public static void main(String[] args) {
    int[] b = {1, 2, 3, 4, 5};
    int[] a = new int[5];
    
    rcopy(a, b);
    for (int value : a) {
      System.out.printf("%d ", value);
    }
  }
  static void rcopy(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      a[i] = b[a.length - i - 1];
    }
  }
}
