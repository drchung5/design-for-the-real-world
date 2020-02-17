package helloworld;

import io.reactivex.Observable;

public class HelloWorld {

  public static void main(String[] argv) {

    Observable o = Observable.just("Hello Reactive, World!");
    o.subscribe(System.out::println);

  }

}
