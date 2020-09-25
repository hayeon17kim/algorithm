package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0111 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while (n > 0) {
      n /= 10; 
      count++;
    }
    System.out.printf("그 수는 %s자리입니다.", count);
  }
}
