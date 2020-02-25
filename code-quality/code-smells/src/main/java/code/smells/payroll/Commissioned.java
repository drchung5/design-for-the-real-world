package code.smells.payroll;

public class Commissioned {

  private float base;
  private float percentage;
  private float sales;

  public float getWeekly() {
    return base + (sales * percentage);
  }

}
