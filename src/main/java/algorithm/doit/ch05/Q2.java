package algorithm.doit.ch05;

import java.util.Scanner;

public class Q2 {
  
  public static int gcd(int x, int y) {
    
    while (y != 0) {
      int temp = x;
      x = y;
      y = temp % y;
    }
    
    return x;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력: ");
    int x = sc.nextInt();
    System.out.print("정수 입력: ");
    int y = sc.nextInt();
    System.out.println(x + "와 " + y + "의 최대 공약수는 " + gcd(x, y) + "입니다.");
  }
}
