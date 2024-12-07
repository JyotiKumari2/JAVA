// remove extra spaces from a string

import java.util.*;
import java.lang.*;

public class RemoveExtraSpaces {

   public static void main(String []args)
   {

    
       String str = "abcg fdjf dhekj    hfdhfjgdfv";
       System.out.println(str.replaceAll("\\s+"," ").trim());  // by using trim(): we can remove leading or trailing spaces
   }
}