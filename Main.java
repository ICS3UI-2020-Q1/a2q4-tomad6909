import java.util.Scanner;
/**
 * This program asks how much the user spent, how much they are saving and what their total is
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for the user
    Scanner input = new Scanner(System.in);

    // define the amount for 10% discount
    final double DISCOUNT10 = 40.00;
    // define the amount for 20% discount
    final double DISCOUNT20 = 80.00;
    // define the amount for 30% discount
    final double DISCOUNT30 = 120.00;
  
    // ask the user to enter amount spent
    System.out.println("Please enter the amount the customer spent");

    double amountSpent = input.nextDouble();

    // determine the % of the discount
    if(amountSpent <= DISCOUNT10){
      System.out.println("They will receive 10% off.");
      
      double answer10 = amountSpent * 0.10;
      
      System.out.println("They will save $" + answer10 + ".");
      
      double total10 = amountSpent - answer10;

      System.out.println("The new total is $" + 
      total10);
   
    } else if (amountSpent <= DISCOUNT20 && amountSpent > DISCOUNT10) {
     
      System.out.println("They will receive 20% off.");

      double answer20 = amountSpent * 0.20;

      System.out.println("They will save $" + answer20 + ".");

      double total20 = amountSpent - answer20;

      System.out.println("The new total is $" + total20);
    
    } else if (amountSpent <= DISCOUNT30 && amountSpent > DISCOUNT20) {

      System.out.println("They will receive 30% off.");

      double answer30 = amountSpent * 0.30;

      System.out.println("They will save $" + answer30 + ".");

      double total30 = amountSpent - answer30;

      System.out.println("The new total is $" + total30);
    
    } else if (amountSpent > DISCOUNT30) {
      
      System.out.println("They will receive 40% off.");

      double answer40 = amountSpent * 0.40;

      System.out.println("They will save $" + answer40 + ".");

      double total40 = amountSpent - answer40;

      System.out.println("The new total is $" + total40);
    }
  }
}
