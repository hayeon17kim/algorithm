package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0206_1 {
  static int cardConv(int x, int y, char[] d) {
    int digits = 0;
    
    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    do {
      d[digits++] = dchar.charAt(x % y);
      x /= y;
    } while (x != 0);
    
    for (int i = 0; i < digits / 2; i++) {
      char temp = d[i];
      d[i] = d[digits - i - 1];
      d[digits - i - 1] = temp;
    }
    
    return digits;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int no; // 변환정수
    int cd; // 기수
    int dno; // 변환된 자리수
    int retry;
    char[] cno = new char[32];
    
    do {
      do {
        System.out.print("변환할 정수를 입력해주세요: ");
        no = sc.nextInt();
      } while (no < 0);
      do {
        System.out.print("어떤 진수로 변환할까요? (2~32): ");
        cd = sc.nextInt();
      } while (cd < 2 || cd > 32);
      
      dno = cardConv(no, cd, cno);
     
      for (int i = 0; i < dno; i++) {
        System.out.print(cno[i]);
      }
      System.out.println();
      System.out.println("다시 하시겠습니까? (예: 0 | 아니오: 1)");
      retry = sc.nextInt();
    } while (retry == 0);
  }
}
