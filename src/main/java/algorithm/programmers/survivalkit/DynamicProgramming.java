package algorithm.programmers.survivalkit;

import java.util.stream.IntStream;

public class DynamicProgramming {
  public static void main(String[] args) {
    System.out.println(solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
  }

  public static int solution(int[][] triangle) {
    int answer = 0;

    for (int i = 1; i < triangle.length; i++) {
      triangle[i][0] +=triangle[i-1][0];
      triangle[i][triangle[i].length - 1] += triangle[i-1][triangle[i-1].length - 1];
      for (int j = 1; j < triangle[i].length - 1; j++) {
        if (triangle[i-1][j-1] < triangle[i-1][j]) {
          triangle[i][j] = triangle[i][j] + triangle[i-1][j];
        } else {
          triangle[i][j] = triangle[i][j] + triangle[i-1][j-1];
        }
        System.out.print("triangle[" + i + "][" + j + "]: " + triangle[i][j] + " ");
      }
      System.out.println();
    }
    answer = IntStream.of(triangle[triangle.length-1]).max().orElse(0);

    return answer;
  }
}
