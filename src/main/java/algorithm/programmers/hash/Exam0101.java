package algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam0101 {
  public static void main(String[] args) {
    System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
  }
  public static String solution(String[] participant, String[] completion) {
    String answer = "";
    Map<String, Integer> map = new HashMap();
    for (String p : participant) {
      if (map.get(p) == null)
        map.put(p, 1);
      else
        map.put(p, map.get(p) + 1);
    }
    for (String c : completion) {
      if (map.get(c) == null && map.get(c) == 1)
        map.remove(c);
      else if (map.get(c) > 1)
        map.put(c, map.get(c) -1);
    }
    Iterator iterator = map.keySet().iterator();
    return (String)iterator.next();
  }
}
