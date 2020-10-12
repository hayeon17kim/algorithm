package algorithm.doit.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] x = {
      "apple", "basic", "cat", "day", "element", "fade", "gain", "height", "icecream"
    };
    
    System.out.print("원하는 키워드를 입력하세요. : "); // 키 값을 입력
    
    String ky = sc.next();
    
    int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소를 입력
    
    if (idx < 0)
      System.out.println("해당 키워드가 없습니다.");
    else
      System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
    }
  }
