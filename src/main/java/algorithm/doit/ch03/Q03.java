package algorithm.doit.ch03;

public class Q03 {
  public static int searchIdx(int[] a, int n, int key, int[]idx) {
    int size = 0;
    for(int i = 0; i < a.length; i++) {
      if (a[i] == key) {
        idx[size++] = i;
      }
    }
    return size;
  }
  
  
  public static void main(String[] args) {
    int[] a = {1, 9, 2, 9 ,4, 6, 7, 9};
    int[] idx = null;
    searchIdx(a, a.length, 9, idx);
  }
}
