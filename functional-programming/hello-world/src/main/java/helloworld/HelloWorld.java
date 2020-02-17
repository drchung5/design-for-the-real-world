package helloworld;

interface Greeting { void print(); }

public class HelloWorld {

  public static void main(String[] argv) {
    display(()->System.out.println("Hello Functional, World!"));
  }

  private static void display( Greeting greeting ) {
    greeting.print();
  }

}
