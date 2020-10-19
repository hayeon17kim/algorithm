package algorithm.doit.ch04;

public class IntQueue {
  private int max; // 큐의 용량
  private int front; // 첫 번째 요소 커서(인큐하는 데이터 가운데 첫번째 요소 위치. 디큐할 위치를 미리 저장!!!!!!!!!)
  private int rear; // 마지막 요소 커서(다음 요소를 인큐할 위치를 미리 저장!!!!!!!!!!!!!!!)
  // front와 rear의 값이 같은 경우 큐가 비어있는 지 가득 차 있는지 구별할 수 없는 상황을 피하기 위해서 이 변수가 필요ㅕ하다.
  // 큐가 비어 있을 때 num==0(front==rear==0), 다 차있을때 num == max
  private int num; // 현재 데이터 수
  private int[] que; // 큐 본체

  // 실행 시 예외: 큐가 비어 있음
  public class EmptyIntQueueException extends RuntimeException {
    public EmptyIntQueueException() {}
  }
  
  // 실행 시 예외: 큐가 가득 참
  public class OverflowIntQueueException extends RuntimeException {
    public OverflowIntQueueException() {}
  }
  
  // 생성자
  public IntQueue(int capacity) {
    num = front = rear = 0;
    max = capacity;
    try {
      que = new int[max];           // 큐 본체용 배열을 생성
    } catch (OutOfMemoryError e) { // 생성할 수 없음
      max = 0;
    }
  }
  
  public int enque(int x) throws OverflowIntQueueException {
    if (num >= max)
      throw new OverflowIntQueueException();
    que[rear++] = x;
    num++;
    if (rear == max)
      rear = 0;
    return x;
  }
  
  public int deque() throws EmptyIntQueueException {
    if (num <= 0)
      throw new EmptyIntQueueException();
    int x = que[front++];
    num--;
    if (front == max)
      front = 0;
    return x;
  }
  
  public int peek() throws EmptyIntQueueException {
    if (num <= 0)
      throw new EmptyIntQueueException();
    return que[front];
  }
  
  public int search(int x) {
    for (int i = 0; i < num; i++) {
      if (que[(front + i) % max] == x)
        return i + 1;
    }
    return 0;
  }
  
  
  public int indexOf(int x) {
    for (int i = 0; i < num; i++) {
      int idx = (i + front) % max;
      if (que[idx] == x)
        return idx;
    }
    return -1;
  }
  
  //  모든 데이터를 삭제하는 메서드
  // 인큐, 디큐는 num, front, rear 값을 바탕으로 0으로 바꾼다. 실제 큐의 배열 요솟값을 바꿀 필요가 없다.
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
  
  // 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
  public void dump() {
    if (num < 0)
      System.out.println("큐가 비어 있습니다.");
    else {
      for (int i = 0; i < num; i++) 
        System.out.print(que[(i + front) % max] + " ");
      System.out.println();
    }
  }
}
