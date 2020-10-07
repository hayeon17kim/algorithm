package algorithm.doit.ch03;

public class GenericClassTester {
  
  static class GenericClass<T> {
    private T xyz;
    GenericClass(T t) {
      xyz = t;
    }
    
    T getXyz() {
      return xyz;
    }
  }
  
  public static void main(String[] args) {
    GenericClass<String> s = new GenericClass<>("ABC");
    GenericClass<Integer> n = new GenericClass<>(15);
    
    System.out.println(s.getXyz());
    System.out.println(n.getXyz());
  } 
}
