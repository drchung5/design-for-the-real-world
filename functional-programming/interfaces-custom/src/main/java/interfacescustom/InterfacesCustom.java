package interfacescustom;

interface Adder<T> { T add( T a, T b); }

public class InterfacesCustom {

  static int alpha = 4;
  static int beta = 5;

  public static void main(String[] argv) {

    Adder<Integer> adder = getAdder();
    System.out.println( foo((x,y)->x+y) );

  }

  static Adder<Integer> getAdder() {
    return (x, y) -> x + y;
  }

  static int foo( Adder<Integer> adder ) {
    return adder.add(alpha, beta);
  }

}
