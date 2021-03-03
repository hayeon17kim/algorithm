package algorithm.programmers.exhaustive;

public class Exam0201 {
  public static void main(String[] args) {
    System.out.println(solution("17"));
    System.out.println(solution("011"));
  }
  public static int solution(String numbers) {
    int answer = 0;
    for (int i = 0; i < numbers.length(); i++) {
      char c = numbers.charAt(i);
      if (c % 2 == 0)
    }
    return answer;
  }
}
// 1 7
// 1, 7, 17, 71
//
// 0 1 1
// 0, 1, 1, 01, 01, 10, 11, 101, 110

// 전체 순열 리스트 구하기
// 소수 판별