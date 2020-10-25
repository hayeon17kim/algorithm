package algorithm.doit.ch05;

public class Q4 {
  
  static void recur2(int n) {
    if (n > 0) {
      recur2(n - 2);
      System.out.println(n);
      recur2(n - 1);
    }
  }
  
  public static void main(String[] args) {
    recur2(4);
  }
}
