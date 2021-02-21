package algorithm.programmers.survivalkit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Hash {

  public static void main(String[] args) {
    System.out.println(solution(new String[][] {new String[]{"yellow_hat", "headgear"}, new String[] {"blue_sunglasses", "eyewear"}, new String[]{"green_turban", "headgear"}}));
  }

  public static int solution(String[][] clothes) {
    int answer = 1;
    int count = 0;
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < clothes.length; i++) {
      map.put(clothes[i][1], count++);
    }

    for (String key : map.keySet()) {
      answer *= (map.get(key) + 1);
    }

    return answer - 1;
  }
}
