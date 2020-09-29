package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0202 {

  static void swap(int[] a, int i1, int i2) {    
    System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n", i1, i2);
    int t = a[i1];
    a[i1] = a[i2];
    a[i2] = t;
  }

  static void reverse(int[] a) {
    printArr(a);
    for (int i = 0; i < a.length / 2; i++) {
      swap(a, i, a.length - i - 1);
      printArr(a);
    }
    System.out.println("역순 정렬을 마쳤습니다.");
  }
  
  static void printArr(int[] a) {
    for (int value : a) {
      System.out.printf("%d ", value);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {5, 10, 73, 2, -5, 42};
    reverse(arr);
  }
}
