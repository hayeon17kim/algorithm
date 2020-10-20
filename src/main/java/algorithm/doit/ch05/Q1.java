package algorithm.doit.ch05;

import java.util.Scanner;

public class Q1 {
  
  public static int factorial(int n) {
    int result = 1;
    
    for (int i = n; i > 1; i--) {
      result *= i;
    }
    
    return result;
    
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요: ");
    int x = sc.nextInt();
    System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
  }
}
