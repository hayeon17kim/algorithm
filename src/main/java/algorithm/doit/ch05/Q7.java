package algorithm.doit.ch05;

public class Q7 {
  static void move(int no, int x, int y) {
    
    while (true) {
      if (no > 1)
        move(no - 1, x, 6 - x - y);
      System.out.println("원반 [" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
      no = no - 1;
      x
    }
    
    if (no > 1)
      move(no - 1, x, 6 - x - y);
    System.out.println("원반 [" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
    if (no > 1) {
      
    }
  }
}
