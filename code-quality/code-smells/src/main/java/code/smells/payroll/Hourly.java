package code.smells.payroll;

public class Hourly {

  private int hours;
  private float perHour;

  public float getWeekly() {
    return hours * perHour;
  }

}
