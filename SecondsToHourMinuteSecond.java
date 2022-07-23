/**
 * Faiz Muhammad
 * 23/7/22
 * Seconds to Hour-Minute-Second
 * Converts a user-inputted value in seconds to a hours-minutes-seconds format
 * Variable List:
 * initialSeconds - user-inputted value of seconds to be converted to hours-minutes-seconds
 * finalHours - the calculated hours from the user-inputted initialSeconds
 * finalMinutes - the calculated minutes from the user-inputted initialSeconds
 * finalSeconds- the calculated seconds from the user-inputted initialSeconds
 */

import java.util.Scanner;

public class secondsToHourMinuteSecond
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the value (the number of seconds) to be converted to hours, minutes, and seconds: ");
      int initialSeconds = scan.nextInt();
      //1 hour = 60 min = 3600 seconds
      int finalHours = initialSeconds / (3600); //3600 seconds = 1 hour, also cuts out decimals
      int finalMinutes = (initialSeconds % (3600))/60; //first cuts out hours, the /60 keeps minutes and cuts out seconds
      int finalSeconds = (initialSeconds % (3600))%60; //first cuts out hours, the %60 cuts out minutes, keeping seconds
      
      //[user's #] seconds equals [# hours, # minutes, #seconds].
      System.out.println(initialSeconds + " seconds is equal to " + finalHours + " hours, " + finalMinutes + " minutes, and " + finalSeconds + " seconds.");
    }
}
