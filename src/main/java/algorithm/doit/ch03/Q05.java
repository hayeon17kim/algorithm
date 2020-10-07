package algorithm.doit.ch03;

import java.util.Scanner;

public class Q05 {
  
  static int binSearchX(int[] a, int n, int key) {
    int pl = 0;
    int pr = n - 1;
    do {
      int pc = (pl + pr) / 2;
      if (a[pc] == key) {
        while (pc != 0 && a[pc - 1] == a[pc]) {
          pc = pc - 1;
        }
        return pc;
        
      } else if (a[pc] > key)
        pr = pc - 1;
      else
        pl = pc + 1;
      
      
    } while (pl <= pr);
    
    return -1;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("요솟수: ");
    int num = sc.nextInt();
    int[] x = new int[num];

    System.out.println("오름차순으로 입력하세요.");
    x[0] = sc.nextInt();

    for (int i = 1; i < num; i++) {
      do {
        System.out.print("x[" +  i + "]:");
        x[i] = sc.nextInt();
      } while (x[i] < x[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
    }

    System.out.print("찾는 값: ");
    int key = sc.nextInt();

    int idx = binSearchX(x, num, key);

    if (idx == -1)
      System.out.println("그 값의 요소가 없습니다.");      
    else
      System.out.println(key + "은  x[" + idx + "]에 있습니다.");
  }
}
