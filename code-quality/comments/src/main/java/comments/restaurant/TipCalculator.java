package comments.restaurant;

import java.text.NumberFormat;

public class TipCalculator {

  private static float TAX_RATE = 0.06f;

  private float food;
  private float beverage;
  private float tipPercent;

  public static void main(String[] argv) {
    TipCalculator tipCalculator = new TipCalculator(41.00f, 8.00f, 0.18f);
    tipCalculator.printBill();
  }

  public TipCalculator(float food, float beverage, float tipPercent) {
    this.food = food;
    this.beverage = beverage;
    this.tipPercent = tipPercent;
  }

  // print the bill
  public void printBill() {

    // crate a currency formatter
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    // print the food value
    System.out.println( "Food:      " + formatter.format(food) );

    // print the beverage value
    System.out.println( "Bev:       " + formatter.format(beverage) );

    // subtotal = food + beverage
    float subtotal = food + beverage;

    // print subtotal
    System.out.println( "Sub Total: " + formatter.format(subtotal) );

    // print a blank line
    System.out.println();

    // tax = subtotal * tax rate
    float tax = subtotal * TAX_RATE;

    // print tax
    System.out.println( "Tax:       " + formatter.format(tax) );

    // total = subtotal + tax
    float total = subtotal + tax;

    // print total
    System.out.println( "Total:     " + formatter.format(total) );

    // print a blank line
    System.out.println();

    // tip = subtotal * tipPercent
    float tip = subtotal * tipPercent;

    // print tip
    System.out.println( "Tip        " + formatter.format(tip) );

    // finalBill = total + tip
    //    variable is named final bill b.c. 'final' is a Java keyword
    float finalBill = total + tip;

    // print final
    System.out.println( "Final      " + formatter.format(finalBill) );

  }

}
