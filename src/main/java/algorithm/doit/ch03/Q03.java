package algorithm.doit.ch03;

public class Q03 {
  public static void searchIdx(int[] a, int n, int key, int[]idx) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < a.length; i++) {
      if (a[i] == key) {
        sb.append(i + " ");
      }
    }
    
    sb.toString().split(" ");
  }
  
  
  public static void main(String[] args) {
    int[] a = {1, 9, 2, 9 ,4, 6, 7, 9};
    int[] idx = null;
    searchIdx(a, a.length, 9, idx);
  }
}
