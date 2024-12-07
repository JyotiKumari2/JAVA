// Find given year is leap year


import java.util.*;
import java.lang.*;

public class FindLeapYear{
 
   public static void main(String []args)
   {
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter year: ");
      int year = sc.nextInt();
      if(year%4==0)
      {
           if(year%100==0)
           {
              if(year%400==0)
                System.out.println(year+ " is a Leap year");
              else
                System.out.println(year+ " is not a Leap year");
           }
           else
             System.out.println(year+ " is a Leap year");
     }
     else
      System.out.println(year + " is not a Leap year");
     
   }
}