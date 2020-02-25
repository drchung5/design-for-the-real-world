package comments.shape;

import java.util.ArrayList;
import java.util.List;

public class SortShapes {

  public static void main(String[] argv) {
    List<Rectangle> rectangles = new ArrayList<Rectangle>();
    rectangles.add(new Rectangle(3,10));
    rectangles.add(new Rectangle(2,1));
    rectangles.add(new Rectangle(5,2));

    rectangles.sort(Rectangle::compareTo);

    System.out.println(rectangles);
  }

}
