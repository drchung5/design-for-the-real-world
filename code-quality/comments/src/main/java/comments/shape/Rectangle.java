package comments.shape;

public class Rectangle implements Comparable<Rectangle> {

  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public int compareTo( Rectangle other ) {
    return (this.length * this.width) - (other.length * other.width);
  }

  @Override
  public String toString() {
    return "("+length + "x" + width + ")";
  }
}
