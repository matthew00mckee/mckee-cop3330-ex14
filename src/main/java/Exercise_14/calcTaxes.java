/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_14;

import java.text.NumberFormat;
import java.util.Scanner;

public class calcTaxes {
    private final double WISCONSIN_TAX_RATE = 0.055;

    private double subtotal;
    private String state;
    private double tax;
    private double total;

    private Scanner Input = new Scanner(System.in);

    public void getSubtotal() {
        System.out.print("What is the order amount? ");
        this.subtotal = Input.nextDouble();
    }

    public void getState() {
        System.out.print("What is the state? ");
        this.state = Input.next();
    }

    public void calculateTax() {
        if(state.equals("WI")) {
            this.tax = subtotal * WISCONSIN_TAX_RATE;
        }
    }

    public void total() {
        this.total = subtotal + tax;
    }

    public void printOutput() {
        if(state.equals("WI")) {
            System.out.printf("The subtotal is %s%n" +
                            "The tax is %s%n" +
                            "The total is %s%n",
                    NumberFormat.getCurrencyInstance().format(subtotal),
                    NumberFormat.getCurrencyInstance().format(tax),
                    NumberFormat.getCurrencyInstance().format(total));
            return;
        }
        System.out.printf("The total is %s%n", NumberFormat.getCurrencyInstance().format(total));
    }
}
