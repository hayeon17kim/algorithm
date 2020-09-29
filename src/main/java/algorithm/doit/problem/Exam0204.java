package algorithm.doit.problem;

public class Exam0204 {
  
  public static void main(String[] args) {
    int[] b = {1, 2, 3, 4, 5};
    int[] a = new int[5];
    
    copy(a, b);
    for (int value : a) {
      System.out.printf("%d ", value);
    }
  }
  
  static void copy(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      a[i] = b[i];
    }
  }
}
