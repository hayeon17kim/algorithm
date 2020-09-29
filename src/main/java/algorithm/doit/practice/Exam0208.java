package algorithm.doit.practice;

public class Exam0208 {
  public static void main(String[] args) {
    
  }
  static int cardConvR(int x, int r, char[] d) {
   int digits = 0;
   String dchar = "01234567890ABCDEFGHIJLKLMNOPQRSTUVWXYZ";
   do {
     d[digits++] = dchar.charAt(x % r);
     x /= r;
   } while(x != 0);
   return digits;
   
  }
}
