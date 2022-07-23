/**
 * Faiz Muhammad
 * 23/7/22
 * Distance Formula
 * Calculates the distance between two user-inputted points
 * Variable List:
 * x1, y1, x2, y2 - respective values of coordinate points (x1, y1) and (x2, y2), which are user-inputted
 * distance - distance b/w (x1, y1) and (x2, y2)
 */

import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class distanceFormula
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat("0.000"); //formats to 3 decimal places
      
      double x1, y1, x2, y2; //for (x1, y1) and (x2, y2)
      
      //gets (x1, y1) values
      System.out.print("Enter the x-coordinate of the first point: ");
      x1 = scan.nextDouble();
      System.out.print("Enter the y-coordinate of the first point: ");
      y1 = scan.nextDouble();
      //gets (x2, y2) values
      System.out.print("Enter the x-coordinate of the second point: ");
      x2 = scan.nextDouble();
      System.out.print("Enter the y-coordinate of the second point: ");
      y2 = scan.nextDouble();
      
      // distance = sqrt[(x2-x1)^2 + (y2-y1)^2]
      double distance = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
      
      //prints: distance b/w [(x1, y1)] and [(x2, y2)] is [the distance]
      System.out.println("\n\nThe distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + fmt.format(distance) + ".");
    }
}
