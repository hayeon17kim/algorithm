package algorithm.doit.ch05;

import java.util.Scanner;

public class Q3 {
  
  
  public static int gcd(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      
    }
  }
  
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("배열 크기: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    
    for (int i = 0; i < size; i++) {
      System.out.print("arr[" + i + "]: ");
      arr[i] = sc.nextInt();
    }
    System.out.println("배열 요소의 최대 공약수는 " + gcd(arr) + "입니다.");
  }
}
