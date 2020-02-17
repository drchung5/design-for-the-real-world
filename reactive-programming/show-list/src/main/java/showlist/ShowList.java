package showlist;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class ShowList {

  public static void main(String[] argv) {
    String[] n = {"alpha","baker","charlie","delta","echo","foxtrot"};
    List<String> names = Arrays.asList(n);
    Observable<String> namesStream = Observable.fromIterable(names);
    namesStream.subscribe(System.out::println);
  }

}
