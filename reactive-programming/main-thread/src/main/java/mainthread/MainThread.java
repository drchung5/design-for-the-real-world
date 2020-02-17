package mainthread;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class MainThread {

  public static void main(String[] argv) {

    System.out.println(Thread.currentThread().getName());

    String[] n = {"alpha","baker","charlie","delta","echo","foxtrot"};
    List<String> names = Arrays.asList(n);
    Observable.fromIterable(names)
        .map(String::toUpperCase)
        .map(x -> x + ": " + Thread.currentThread().getName())
        .subscribe(
            System.out::println,
            x -> System.err.println(x.getStackTrace()),
            () -> System.out.println( "done: " + Thread.currentThread().getName() )
        );

    System.out.println(Thread.currentThread().getName());

  }

}
