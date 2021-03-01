package algorithm.codility;

public class BinaryGap {
  public int solution(int N) {
    String str = Integer.toBinaryString(N);
    int gap = 0;
    int maxGap = 0;
    for (int i = 0; i < str.length(); i++) {
      switch (str.charAt(i)) {
        case '0':
          gap++; break;
        case '1':
          if (gap > maxGap) maxGap = gap;
          gap = 0; break;
      }
    }
    return maxGap;
  }
}
