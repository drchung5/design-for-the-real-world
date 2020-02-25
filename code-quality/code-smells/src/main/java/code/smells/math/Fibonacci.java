package code.smells.math;

public class Fibonacci {

  public static void main(String[] argv) {
    System.out.println(Fibonacci.getFib(7));
  }

  public static int getFib(int n) {

    if(n <= 1) return n;

    int prevFib = 0;
    int currFib = 1;

    for(int i = 0; i < n - 1; i++) {
      int newFib = prevFib + currFib;
      prevFib = currFib;
      currFib = newFib;
    }

    return currFib;

  }

}
