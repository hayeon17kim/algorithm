package algorithm.doit.ch03;

import java.util.Scanner;

public class Q04 {

  static int binSearchEx(int[] x, int num, int key) {

    System.out.print("   |");
    for (int k = 0; k < num; k++)
      System.out.printf("%4d", k);
    System.out.println();

    System.out.print("---+");
    for (int k = 0; k < 4 * num + 2; k++)
      System.out.print("-");
    System.out.println();

    int pl = 0;
    int pr = num - 1;

    do {
      int pc = (pr + pl)/2;
      System.out.print("   |");
      // 공백을 얼마나 줘야 하는 지에 대한 것임. 뒤에 빈 문자열은 공백을 위한 것
      if (pl != pc)
        System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
      else
        System.out.printf(String.format("%%%ds+", pc * 4 + 1), "");
      
      if (pc != pr)
        System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
      else
        System.out.println("->");
      System.out.printf("%3d|", pc);
      for (int k = 0; k < num; k++)
        System.out.printf("%4d", x[k]);
      System.out.println();
      if (x[pc] == key)
        return pc;
      else if (x[pc] > key)
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

    int idx = binSearchEx(x, num, key);

    if (idx == -1)
      System.out.println("그 값의 요소가 없습니다.");      
    else
      System.out.println(key + "은  x[" + idx + "]에 있습니다.");
  }
}
