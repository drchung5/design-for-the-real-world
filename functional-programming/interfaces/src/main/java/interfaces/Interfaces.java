package interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Interfaces {

  public static void main(String[] argv) {

    Function<Integer,Integer> doubler = getDoubler();
    System.out.println(doubler.apply(7));

    Consumer<String> messageConsumer = getPrinter();
    messageConsumer.accept("Consumer");

    Predicate<Integer> oddChecker = getOddChecker();
    System.out.println(oddChecker.test(7));
    System.out.println(oddChecker.test(-4));
  }


  public static Function<Integer,Integer> getDoubler() {
    return x -> 2 * x;
  }

  public static Consumer<String> getPrinter() {
    return System.err::println;
  }

  public static Predicate<Integer> getOddChecker() {
    return x -> x % 2 != 0;
  }

}
