package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0106 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("1부터 n까지의 합을 구합니다.");
    System.out.print("n의 값: ");
    int n = in.nextInt();

    int sum = 0;
    int i = 1;
    while (i <= n) {
      sum += i;
      i++;
    }

    System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    System.out.println("i는 " + i + "입니다.");
  }
}
