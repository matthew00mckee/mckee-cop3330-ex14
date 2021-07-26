/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_14;

public class controller {
    public static void main(String[] args) {
        calcTaxes getTotal = new calcTaxes();

        getTotal.getSubtotal();
        getTotal.getState();

        getTotal.calculateTax();
        getTotal.total();

        getTotal.printOutput();
    }
}
