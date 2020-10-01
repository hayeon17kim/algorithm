package algorithm.doit.problem;

import java.util.Scanner;

public class Exam0208 {
  static int[][] mdays = {
      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  };
  
  // 서기 year년은 윤년인가?
  static int isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
  }

  static int dayOfYear(int y, int m, int d) {
    while (--m != 0) {
      d += mdays[isLeap(y)][m - 1];
    }
    return d;
  }
  
  // 주의할 점은 1월은 0번 인덱스에 있다는 것이다.
  // 따라서 m-1로 값을 주었다. 
  
  
  // 처음에 카운트 변수를 따로 선언했으나 그럴 필요가 없었다.
  // 0번 인덱스에 있는 값부터 더하는 것이 아니라 m-1번 인덱스에 들어있는 값부터 더하면 되는 것이다.
  // 또한 기본 자료형이기 때문에 메서드 안에서 값을 마음대로 변형하여도 원본값에는 형향을 미치지 않는다.
  //
  
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
      
      System.out.printf("%d일이 경과되었습니다.", dayOfYear(year, month, day));
      System.out.println("다시 하시겠습니까? (예: 1 | 아니오: 0");
      retry = sc.nextInt();
    } while (retry == 1);
  }

}
