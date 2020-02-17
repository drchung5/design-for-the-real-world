package showlistcallbacks;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class ShowListCallbacks {

  public static void main(String[] argv) {
    String[] n = {"alpha","baker","charlie","delta","echo","foxtrot"};
    List<String> names = Arrays.asList(n);
    Observable<String> namesStream = Observable.fromIterable(names);
    namesStream.subscribe(
        System.out::println,
        x -> System.err.println(x.getStackTrace()),
        () -> System.out.println("*** done ***")
    );
  }

}
