package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;

    while (true) {
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println("a의 값: " + a);
      System.out.println("b의 값: " + b);
      if (b > a)
        break;
      System.out.println("a보다 더 큰 값을 입력하세요!");
    }
    System.out.println("b - a는 " + (b - a) + "입니다.");
  }
}
