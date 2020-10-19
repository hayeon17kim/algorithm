package algorithm.doit.ch04;

public class IntDeque {
  private int max;
  private int num;
  private int front;
  private int rear;
  private int[] que;
  
  public IntDeque(int capacity) {
    max = capacity;
    que = new int[max];
  }
  
  public class OverflowIntDequeueException extends RuntimeException {
    public OverflowIntDequeueException() {}
  }
  
  public class EmptyIntDequeueException extends RuntimeException {
    public EmptyIntDequeueException() {}
  }
  
  public int enqueFront(int x) throws OverflowIntDequeueException {
    if (num >= max)
      throw new OverflowIntDequeueException();
    if (--front < 0)
      front = max - 1;
    que[front] = x;
    num++;
    return x;
  }
  
  public int enqueRear(int x) throws OverflowIntDequeueException {
    if (num >= max)
      throw new OverflowIntDequeueException();
    que[rear++] = x;
    num++;
    if (rear == max)
      rear = 0;
    return x;
  }
  
  public int dequeFront() throws EmptyIntDequeueException {
    if (num <= 0)
      throw new EmptyIntDequeueException();
    int x = que[++front];
    num--;
    if (front == max)
      front = 0;
    return x;
  }
  
  public int dequeRear() throws EmptyIntDequeueException {
    if (num <= 0)
      throw new EmptyIntDequeueException();
    num--;
    if (--rear < 0)
      rear = max - 1;
    return que[rear];
  }
  
  public int peekFront() throws EmptyIntDequeueException {
    if (num <= 0)
      throw new EmptyIntDequeueException();
    return que[front];
  }
  
  public int peekRear() throws EmptyIntDequeueException {
    if (num <= 0)
      throw new EmptyIntDequeueException();
    return que[rear == 0 ? max - 1 : rear - 1];
  }
  
  public int indexOf(int x) {
    for (int i = 0; i < num; i++) {
      int idx = (front + i) % max;
      if (que[idx] == x)
        return idx;
    }
    return -1;
  }
  
  
  public int search(int x) {
    for (int i = 0; i < num; i++) {
      if (que[(front + i) % max] == x)
        return i;
    }
    return -1;
  }
  
  public void clear() {
    num = front = rear = 0;
  }
  
  public int capacity() {
    return max;
  }
  
  public int size() {
    return num;
  }
  
  public boolean isEmpty() {
    return num <= 0;
  }
  
  public boolean isFull() {
    return num >= max;
  }
  
  public void dump() {
    if (num <= 0)
      System.out.println("deck이 비었습니다.");
    else {
      for (int i = 0; i < num; i++)
        System.out.print(que[(i + front) % max] + " ");
      System.out.println();
    }
  }
}
