package algorithm.doit.ch05;

import java.util.Scanner;

public class EuclidGCD {
  public static int gcd(int x, int y) {
    if (y == 0)
      return x;
    else
      return gcd(y, x % y);
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


// gcd(22, 8)
// gcd(8, 6)
// gcd(6, 2)
// gcd(2, 0)
// 2