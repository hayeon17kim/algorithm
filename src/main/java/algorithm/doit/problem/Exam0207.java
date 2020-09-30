package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0207 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no;
    int cd;
    int dno;
    char[] cno = new char[32];
    
    System.out.println("10진수를 기수변환합니다.");
    System.out.print("변환하는 음이 아닌 정수: ");
    no = sc.nextInt();
    System.out.println("어떤 진수로 변환할까요?(2-36): ");
    cd = sc.nextInt();
    
    dno = CardConv(no, cd, cno);
    
    for (int i = 0; i < dno; i++) {
      System.out.print(cno[i]);
    }
  }
  
  static int CardConv (int x, int y, char[] d) {
    int digits = 0;
    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    do {
      if (digits == 0) {
        System.out.printf("%d|%6d\n", y, x);
        System.out.println(" +------");        
      }
      else if (x / y != 0) {
        System.out.printf("%d|%6d  ...%d\n", y, x ,x % y);
        System.out.println(" +------");               
      }
      else
        System.out.printf("%8d  ...%d\n", y, x ,x % y);
      d[digits++] = dchar.charAt(x % y);
      
      x /= y;
      
    } while (x != 0);
    
    for (int i = 0; i < digits /2; i++) {
      char temp = d[i];
      d[i] = d[digits - i - 1];
      d[digits - i - 1] = temp;
    }
    return digits;
  }
}
