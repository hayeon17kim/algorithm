package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0108 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = (n + 1) * (n / 2) + (n % 2 == 0 ? 0 : n / 2 + 1);
    System.out.println(result);
  }
}

// 1 + 2 + 3 + 4 = (1 + 4) * 2
// 1 + 2 + 3 + 4 + 5 = (1 + 5) * 2 + 3
