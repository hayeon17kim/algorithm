package algorithm.programmers.survivalkit;

import java.util.stream.IntStream;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{120, 110, 140, 150}, 485));
  }


  public static int solution(int[] budgets, int M) {
    int answer = 0;
    int min = 0;
    int max = IntStream.of(budgets).max().orElse(0);

    int mid = 0;
    int sum = 0;
    while (min <= max) {
      mid = (max - min) / 2;
      for (int b : budgets) {
        if (b > mid) sum += mid;
        else sum += b;
      }
      if (sum < M) min = mid + 1;
      else max = mid - 1;
    }
    answer = mid;
    return answer;
  }
}
