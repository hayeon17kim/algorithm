package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0209 {
  
  static int[][] mdays = {
      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31},
      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  };
  
  static int isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0; 
  }
  
  /*
  static int leftDayOfYear(int y, int m, int d) {
    while (--m != 0)
      d += mdays[isLeap(y)][m - 1];
    return isLeap(y) == 0 ? 365 - d : 366 - d;
  }
  */
  // 굳이 이렇게 해줄 필요가 없음.. isLeap()는 윤년일때 1을 반환하기 때문ㅇ
  // 그냥 365 + isLeap(y) - d를 해주면 됨.
  static int leftDayOfYear(int y, int m, int d) {
    while (--m != 0)
      d += mdays[isLeap(y)][m - 1];
    return 365 + isLeap(y) - d;
  }
  
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int retry;
    
    System.out.println("그 해의 경과 일수를 구합니다.");
    
    do {
      System.out.print("년? ");
      int year = sc.nextInt();
      System.out.print("월? ");
      int month = sc.nextInt();
      System.out.print("일? ");
      int day = sc.nextInt();
      
      System.out.printf("%d일이 경과되었습니다.", leftDayOfYear(year, month, day));
      System.out.println("다시 하시겠습니까? (예: 1 | 아니오: 0");
      retry = sc.nextInt();
    } while (retry == 1);
  }
}
