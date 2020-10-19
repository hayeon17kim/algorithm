package algorithm.doit.ch04;


public class Q3 {
  private int max; // 스택 용량
  private int ptrA; // 스택 포인터
  private int ptrB;
  private int[] stk; // 스택 본
  
  public enum WhichStack { stackA, stackB }


  // 실행 시 예외: 스택이 비어 있음 
  public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() {}
  }
  
  // 실행 시 예외: 스택이 가득 
  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() {
    }
  }
  
  public Q3(int capacity) {
    ptrA = 0;
    ptrB = capacity - 1; // ptr은 인덱스
    max = capacity;
    try {
      stk = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }
  
  public int push(WhichStack stack, int x) throws OverflowIntStackException {
    if (ptrA >= ptrB + 1) {
      throw new OverflowIntStackException();
    }
    switch (stack) {
      case stackA:
        return stk[ptrA++] = x;
      default: 
        return stk[ptrB--] = x;
    }
  }
  
  public int pop(WhichStack stack) throws EmptyIntStackException {
    switch (stack) {
      case stackA:
        if (ptrA <= 0)
          throw new EmptyIntStackException();
        return stk[--ptrA];
      default:
        if (ptrB >= max - 1)
          throw new EmptyIntStackException();
        return stk[++ptrB];
    }
  }
  
  public int peek(WhichStack stack) throws EmptyIntStackException {
    switch (stack) {
      case stackA:
        if (ptrA == 0)
          throw new EmptyIntStackException();
        return stk[ptrA - 1];
      default:
        if (ptrB == max - 1)
          throw new EmptyIntStackException();
        return stk[ptrB + 1];
    }
  }
  
  public int indexOf(WhichStack stack, int key) {
    switch(stack) {
      case stackA:
        for (int i = ptrA - 1; i <= 0; i--) {
          if (stk[i] == key)
            return i;
        }
        break;
      default:
        for (int i = ptrB + 1; i > max; i++) {
          if (stk[i] == key)
            return i;
        }
        break;
    }
    return -1;
    
  }
  
  // 스택에 대한 푸시와 팝 등 모든 작업은 스택 포인터를 바탕으로 이루어진다.
  // 따라서 스택의 배열 요솟값을 변경할 필요가 없다.
  // 모든 요소의 삭제는 스택 포인터 ptr 값을 0으로 하면된다.
  public void clear(WhichStack stack) {
    switch (stack) {
      case stackA:
        ptrA = 0;
        break;
      default:
        ptrB = max;
    }
  }
  
  public int capacity() {
    return max;
  }
  
  public int size(WhichStack stack) {
    switch (stack) {
      case stackA:
        return ptrA;
      default:
        return max - ptrB - 1;
    }
  }
  
  public boolean isEmpty(WhichStack stack) {
    switch (stack) {
      case stackA:
        return ptrA <= 0;
      default:
        return ptrB >= max - 1;
    }
  }
  
  public boolean isFull() {
    return ptrA >= ptrB + 1;
  }
  
  // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
  public void dump(WhichStack stack) {
    switch (stack) {
      case stackA:
        if (ptrA <= 0)
          System.out.println("스택이 비어있습니다.");
        else {
          for (int i = 0; i < ptrA; i++)
            System.out.println(stk[i] + " ");
          System.out.println();
        }
        break;
      default:
        if (ptrB >= max)
          System.out.println("스택이 비어있습니다.");
        else {
          for (int i = max; i > ptrB; i--)
            System.out.println(stk[i] + " ");
          System.out.println();
        }
        break;
    }
  }
}
