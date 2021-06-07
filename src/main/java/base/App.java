/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Scanner;

/* Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of
the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and
then print out the subtotal, tax amount, and total.

Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints

Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges

Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
 */
public class App 
{
    static double taxRate = 0.055;

    public static void main( String[] args )
    {
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        Scanner number3 = new Scanner(System.in);
        Scanner number4 = new Scanner(System.in);
        Scanner number5 = new Scanner(System.in);
        Scanner number6 = new Scanner(System.in);

        // input price and quantity of item 1
        System.out.print("Enter the price of item 1: ");
        int price1 =  number1.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 =  number2.nextInt();

        // input price and quantity of item 2
        System.out.print("Enter the price of item 2: ");
        int price2 =  number3.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 =  number4.nextInt();

        // input price and quantity of item 3
        System.out.print("Enter the price of item 3: ");
        int price3 =  number5.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 =  number6.nextInt();

        //calculate subtotal
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

        //calculate tax
        double tax = subtotal * taxRate;

        //calculate total
        double total = subtotal + tax;

        // output
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);

    }
}
