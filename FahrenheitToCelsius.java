/**
 * Faiz Muhammad
 * 13/8/22
 * Fahrenheit to Celsius
 * Converts an inputted Fahrenheit temperature to the equivalent Celsius temperature
 * Variable List:
 * CONVERSION_FACTOR - a constant value used in converting from Fahrenheit to Celsius (reciprocal may be used for C to F)
 * fahrenheitTemp - a user-inputted value, to be converted to celsius
 * celsiusTemp - derived from the user-inputted fahrenheit temperature
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
     final double CONVERSION_FACTOR = 5.0/9.0; //constant for converting from Fahrenheit to Celsius
     Scanner scan = new Scanner(System.in);
     DecimalFormat fmt = new DecimalFormat("0.000"); //formats to 3 decimal places
     
     System.out.print("Enter the Fahrenheit temperature to convert to Celsius: ");
     double fahrenheitTemp = scan.nextDouble();
     
     double celsiusTemp = CONVERSION_FACTOR * (fahrenheitTemp - 32); //rearranging eq. in the book
     
     System.out.println("Fahrenheit Temperature: " + fmt.format(fahrenheitTemp));
     System.out.println("Celsius Equivalent: " + fmt.format(celsiusTemp));
    }
}
