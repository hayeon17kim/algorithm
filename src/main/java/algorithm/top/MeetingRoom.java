package algorithm.top;

public class MeetingRoom {
  static class Interval{
    int start;
    int end;
    Interval(){
      this.start = 0;
      this.end =0;
    }
    Interval(int s, int e){
      this.start = s;
      this.end = e;
    }
  }

  public static void main(String[] args) {
    System.out.println(mySolution(new Interval[] {new Interval(0,30), new Interval(5,10), new Interval(15, 20)}));
    System.out.println(mySolution(new Interval[] {new Interval(7,10), new Interval(2,4)}));
    
  }

  public static boolean mySolution(Interval[] intervals) {
    int begin = intervals[0].start;
    int finish = intervals[0].end;
    boolean[] time = new boolean[100000];
    for (int i = 0; i < intervals.length; i++) {
      /*
      if (begin > intervals[0].start) begin = intervals[i].start;
      if (finish < intervals[0].end) finish = intervals[i].end;
       */
      for (int j = intervals[i].start; j < intervals[i].end; j++) {
        if (!time[j]) time[j] = true;
        else return false;
      }
    }
    return true;
  }
}

