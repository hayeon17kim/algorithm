package algorithm.top;

import java.util.ArrayList;
import java.util.List;

public class MergeInterval {
  class Interval {
    int start;
    int end;
    Interval() {
      start = 0;
      end = 0;
    }
    Interval(int s, int e) {
      start = s;
      end = e;
    }
  }

  public List<Interval> merge(List<Interval> intervals) {
    return new ArrayList<Interval>();
  }
}
