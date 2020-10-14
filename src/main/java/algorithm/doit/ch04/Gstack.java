package algorithm.doit.ch04;

import algorithm.doit.ch04.IntStack.EmptyIntStackException;
import algorithm.doit.ch04.IntStack.OverflowIntStackException;

public class Gstack <E> {
  private int max; // 스택 용량
  private int ptr; // 스택 포인터
  private E[] stk; // 스택 본
  
  // 실행할 때 예외：스택이 비어 있음
  public static class EmptyGstackException extends RuntimeException {
      public EmptyGstackException() {
      }
  }
  // 실행할 때 예외：스택이 가득 참
  public static class OverflowGstackException extends RuntimeException {
      public OverflowGstackException() {
      }
  }
  
  public Gstack(int capacity) {
    ptr = 0;
    max = capacity;
    try {
      stk = (E[]) new Object[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }
  public E push(E x) throws OverflowGstackException {
    if (ptr == max)
      throw new OverflowGstackException();
    return stk[ptr++] = x;
  }
  
  public E pop() throws EmptyGstackException {
    if (ptr == 0)
      throw new EmptyGstackException();
    return stk[--ptr];
  }
  
  public E peek() throws EmptyGstackException {
    if (ptr == 0)
      throw new EmptyGstackException();
    return stk[ptr -1];
  }
  
  public int indexOf(E key) {
    for (int i = ptr - 1; i <= 0; i--) {
      if (stk[i].equals(key))
        return i;
    }
    return -1;
  }
  
  // 스택에 대한 푸시와 팝 등 모든 작업은 스택 포인터를 바탕으로 이루어진다.
  // 따라서 스택의 배열 요솟값을 변경할 필요가 없다.
  // 모든 요소의 삭제는 스택 포인터 ptr 값을 0으로 하면된다.
  public void clear() {
    ptr = 0;
  }
  
  public int capacity() {
    return max;
  }
  
  public int size() {
    return ptr; 
  }
  
  public boolean isEmpty() {
    return ptr <= 0;
  }
  
  public boolean isFull() {
    return ptr >= max;
  }
  
  // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
  public void dump() {
    if (ptr <= 0) {
      System.out.println("스택이 비어있습니다.");
    } else {
      for (int i = 0; i < ptr; i++)
        System.out.println(stk[i]);
      System.out.println();
    }
  }
  

}
