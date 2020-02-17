package tasks;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Tasks {

  public static void main(String[] argv) {
    String[] n = {"alpha","baker","charlie","delta","echo","foxtrot"};
    List<String> names = Arrays.asList(n);
    Observable.fromIterable(names)
        .map(String::toUpperCase)
        .filter( x -> x.length() > 6)
        .subscribe(
            System.out::println,
            x -> System.err.println(x.getStackTrace()),
            () -> System.out.println("*** done ***")
        );
  }

}
