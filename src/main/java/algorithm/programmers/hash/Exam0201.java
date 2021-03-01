package algorithm.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Exam0201 {
  public static void main(String[] args) {
    System.out.println(mySolution(new String[] {"199", "97674223", "1195524421"}));
    System.out.println(mySolution(new String[] {"123", "456", "789"}));
  }
  public static boolean mySolution(String[] phone_book) {
    boolean answer = true;
    for (int i = 0; i < phone_book.length; i++) {
      for (int j = 0; j < phone_book.length; j++) {
        if (i == j) continue;
        if (phone_book[i].startsWith(phone_book[j])) {
          answer = false;
          break;
        }
      }
    }
    return answer;
  }
}
