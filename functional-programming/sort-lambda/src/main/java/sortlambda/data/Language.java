package sortlambda.data;

import java.util.ArrayList;
import java.util.List;

public class Language {

  private String name;
  private int year;

  public Language(String name, int year) {
    this.name = name;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public String toString() {
    return name + ": " + year;
  }

}