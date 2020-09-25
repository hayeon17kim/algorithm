package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0115 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    triangleLB(n);
    triangleLU(n);
    triangleRU(n);
    triangleRB(n);
  }
  
  public static void triangleLB(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void triangleLU(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void triangleRU(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = n; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void triangleRB(int n) {
    for(int i = 1; i <= n; i++) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
