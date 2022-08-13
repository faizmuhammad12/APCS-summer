/**
 * Faiz Muhammad
 * 13/8/22
 * 
 * Three Numbers
 * Reads three numbers, storing them into respective variables, and prints their average
 * 
 * Variable List:
 * a - first number inputted by user
 * b - second number inputted by user
 * c - third number inputted by user
 * average - average of three inputted numbers
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ThreeNumbers
{
    public static void main(String[] args)
    {
        //type name = new type();
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.000"); //formats to 3 decimal places
        
        System.out.print("Enter the first number: ");
        double a = scan.nextDouble();
        
        System.out.print("Enter the second number: ");
        double b = scan.nextDouble();
        
        System.out.print("Enter the third number: ");
        double c = scan.nextDouble();
        
        double average = (a+b+c)/3; // avg = values summed / # of values
        
        System.out.println("The average of these three numbers is " + fmt.format(average));
    }
}
