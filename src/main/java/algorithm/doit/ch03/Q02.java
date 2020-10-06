package algorithm.doit.ch03;

import java.util.Scanner;

public class Q02 {
  
  static int seqSearch(int a[], int n, int key) {
    System.out.print("  |");
    for (int k = 0; k < n; k++)
      System.out.printf("   %d", k);
    System.out.println();
    for (int k = 0; k < 4 * n + 2; k++)
      System.out.print("-");
    
    int i;
    for (i = 0; i <= n; i++) {
      System.out.println();
      System.out.printf(String.format("   %%%ds*\n", (i * 4) + 3), "");
      System.out.printf("%2d|", i);
      for (int k = 0; k < n; k++)
          System.out.printf("%4d", a[k]);
      if (a[i] == key)
        break;
    }
    System.out.println();
    return i == n ? -1 : i;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("요솟수");
    int n = sc.nextInt();
    int arr[] = new int[n + 1];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    
    System.out.print("찾고싶은 숫자");
    int key = sc.nextInt();
    arr[n] = key;
    System.out.println(seqSearch(arr, n, key) + "번째에 있다");
    
  }
}
