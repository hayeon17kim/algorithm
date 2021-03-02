package algorithm.programmers.exhaustive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Exam0101 {

  public static void main(String[] args) {
    System.out.println(new int[]{1,2,3,4,5});
    System.out.println(new int[]{1,3,2,4,2});
  }

  public static int[] solution(int[] answers) {
    int[] count = new int[3];
    int[][] patterns = new int[][] {
      new int[]{1,2,3,4,5},
      new int[]{2,1,2,3,2,4,2,5},
      new int[]{3,3,1,1,2,2,4,4,5,5}
    };
    for (int i = 0; i < answers.length; i++) {
      for (int j = 0; j < patterns.length; j++) {
        if (answers[i] == patterns[j][i % patterns[j].length])
          count[j]++;
      }
    }
    int max = IntStream.of(count).max().getAsInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < count.length; i++) {
      if (count[i] == max) list.add(i + 1);
    }
    return list.stream().mapToInt(n -> n).toArray();
  }
}
