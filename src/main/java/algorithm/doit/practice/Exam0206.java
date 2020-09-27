package algorithm.doit.practice;

public class Exam0206 {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }
  
  static void reverse(int[] a) {
    for (int i = 0; i < a.length/2; i++) {
      swap(a, i, a.length - i - 1);
    }
  }
  
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    reverse(arr);
    System.out.println();
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
