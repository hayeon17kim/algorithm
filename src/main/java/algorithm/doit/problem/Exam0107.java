package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0107 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
