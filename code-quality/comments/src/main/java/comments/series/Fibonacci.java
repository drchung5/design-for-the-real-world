package comments.series;

public class Fibonacci {

  // returns the nth fibonnaci number
  public static int getFib(int n) {

      // fib(0) = 0 and fib(1) = 1
      if (n <= 1)
        return n;

      // each fibonacci number is the sum of the previous 2
      return getFib(n-1) + getFib(n-2);
  }

}
