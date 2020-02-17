package threadscheduler;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.Arrays;
import java.util.List;

public class ThreadScheduler {

  public static void main(String[] argv) {

    System.out.println(Thread.currentThread().getName());

    String[] n = {"alpha","baker","charlie","delta","echo","foxtrot"};
    List<String> names = Arrays.asList(n);
    Observable.fromIterable(names)
        .map(String::toUpperCase)
        .map(x -> x + ": " + Thread.currentThread().getName())
        .subscribeOn(Schedulers.single()) // insert alternate Schedulers here
        .subscribe(
            System.out::println,
            x -> System.err.println(x.getStackTrace()),
            () -> System.out.println( "done: " + Thread.currentThread().getName() )
        );

    // sleep is required to keep application alive
    // while work is being done off of the main thread
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName());

  }


}
