package algorithm.doit.ch04;

public class IntStack {
  private int max; // 스택 용량
  private int ptr; // 스택 포인터
  private int[] stk; // 스택 본

  // 실행 시 예외: 스택이 비어 있음 
  public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() {}
  }
  
  // 실행 시 예외: 스택이 가득 
  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() {
    }
  }
  
  public IntStack(int capacity) {
    ptr = 0;
    max = capacity;
    try {
      stk = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }
  
  public int push(int x) throws OverflowIntStackException {
    if (ptr == max)
      throw new OverflowIntStackException();
    return stk[ptr++] = x;
  }
  
  public int pop() throws EmptyIntStackException {
    if (ptr == 0)
      throw new EmptyIntStackException();
    return stk[--ptr];
  }
  
  public int peek() throws EmptyIntStackException {
    if (ptr == 0)
      throw new EmptyIntStackException();
    return stk[ptr -1];
  }
  
  public int indexOf(int key) {
    for (int i = ptr - 1; i <= 0; i--) {
      if (stk[i] == key)
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
