package closures;

import java.util.function.Predicate;

public class Closure {

  public static void main(String[] argv) {
    Predicate<Integer> lambda = getLambda();
    System.out.println(lambda.test(3));
  }

  public static Predicate<Integer> getLambda() {
    int a = 7; // this variable is 'effectively final'
    return x -> x == a;
  }

}
