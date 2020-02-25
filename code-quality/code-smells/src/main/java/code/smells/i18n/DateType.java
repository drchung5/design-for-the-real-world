package code.smells.i18n;

public class DateType {

  public static void main( String[] argv ) {
    DateType date = new DateType(Month.DEC,7,1941,CountryCode.FRA);
    System.out.println(date);
  }

  public static enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
  }

  public static enum CountryCode {
    USA, CAN, FRA
  }

  private DateType.Month month;
  private int day;
  private int year;
  private CountryCode countryCode;

  public DateType(Month month, int day, int year, CountryCode countryCode) {
    this.month = month;
    this.day = day;
    this.year = year;
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {

    String result = "";

    if( countryCode == CountryCode.USA ) {
      result += month.ordinal() + "/" +day + "/" + year;
    } else if ( countryCode == CountryCode.CAN ) {
      result += day + "/" + month.ordinal() + "/" + year;
    } else if ( countryCode == CountryCode.FRA ) {
      result += day + "/" + month.ordinal() + "/" + year;
    }

    return result;

  }
}
