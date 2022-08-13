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
        
        System.out.print("Enter the first number (a): ");
        double a = scan.nextDouble();
        
        System.out.print("Enter the second number (b): ");
        double b = scan.nextDouble();
        
        //returns corresponding value
        double sum = (a+b);
        double difference_a = (a-b);
        double product = (a*b);
        double quotient_a = (a/b);
        double remainder_a = (a%b);
        double power_a = Math.pow(a, b); //a^b
        
        double difference_b = (b-a);
        double quotient_b = (b/a);
        double remainder_b = (b%a);
        double power_b = Math.pow(b, a); //b^a
        
        //first "block" of output statements are for the "_a" calculations (+sum and product of values), second "block" for "_b" calculations
        System.out.println("\nThe sum (a+b): " + fmt.format(sum));
        System.out.println("The difference (a-b): " + fmt.format(difference_a));
        System.out.println("The product (a*b): " + fmt.format(product));
        System.out.println("The quotient (a/b): " + fmt.format(quotient_a));
        System.out.println("The remainder of the first divided by the second (a%b): " + fmt.format(remainder_a));
        System.out.println("Raising the first to the second (a^b): " + fmt.format(power_a));
        
        System.out.println("\nThe difference (b-a): " + fmt.format(difference_b));
        System.out.println("The quotient (b/a): " + fmt.format(quotient_b));
        System.out.println("The remainder of the second divided by the first (b%a): " + fmt.format(remainder_b));
        System.out.println("Raising the second to the first (b^a): " + fmt.format(power_b));
    }
}
