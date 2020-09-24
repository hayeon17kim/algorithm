package algorithm.doit.problem;

public class Exam0109 {
  public static void main(String[] args) {
    System.out.println(sumof(1, 10));
  }

  public static int sumof(int a, int b) {
    int result = 0;
    for (int i = (a < b ? a : b); i <= (a < b ? b : a); i++) {
      result += i;
    }
    return result;
  }
}
