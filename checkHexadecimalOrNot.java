// Find if a number is hexadecimal or not?

import java.util.*;
import java.lang.*;

class checkHexadecimalOrNot{
   
   public static void main(String[] args)
   {
       String s = "2321AF";
       System.out.println(s.matches("[0-9A-F]+")); // true;
   }
}