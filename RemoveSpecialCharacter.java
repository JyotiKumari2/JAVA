// Remove special characters from a string

import java.util.*;
import java.lang.*;

public class RemoveSpecialCharacter
{

   public static void main(String []args)
   {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string with special characters");
         String str = sc.nextLine();
         String s = str.replaceAll("[^a-zA-Z0-9]","");
         System.out.println("Output the resultant string after removing special strings: " + s);
   }
}