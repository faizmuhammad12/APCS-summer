/**
 * Faiz Muhammad
 * 23/7/22
 * Math Operators
 * Takes the sum, difference, product, quotient, remainder, and power of two numbers
 * Variable List:
 * a - first inputted number
 * b - second inputted number
 * sum - sum of a and b
 * difference - difference of a and b
 * product - product of a and b
 * quotient - quotient of a and b
 * remainder - remainder of a divided by b
 * power - calculation of a^b
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class MathOperators
{
    public static void main(String[] args)
    {
        DecimalFormat fmt = new DecimalFormat("0.000"); //formats to 3 decimal places
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double a = scan.nextDouble();
        
        System.out.print("Enter the second number: ");
        double b = scan.nextDouble();
        
        //returns corresponding value
        double sum = (a+b);
        double difference = (a-b);
        double product = (a*b);
        double quotient = (a/b);
        double remainder = (a%b);
        double power = Math.pow(a, b); //a^b
        
        //2 outputs: prints sum, difference, product w/ 1st statement & quotient, remainder, power w/ 2nd statement
        System.out.println("\nThe sum: " + fmt.format(sum) + "\nThe difference: " + fmt.format(difference) + "\nThe product: " + fmt.format(product));
        System.out.println("\nThe quotient: " + fmt.format(quotient) + "\nThe remainder of the first divided by the second: " + fmt.format(remainder) + "\nRaising the first to the second: " + fmt.format(power));
    }
}
