// Wrapper Class

import java.lang.*;
import java.util.*;

// Float, Character & Boolean Classes


public class WrapperDemo1
{

   public static void main(String[] args)
   {
     float a = 12.5f;
     Float b = 12.5f;
     Float c = 12.5f/0;
      
     System.out.println(b.equals(a)); // a==b
     // isInfinite, isNAN
     
     System.out.println(c.isInfinite());  // true
     System.out.println(c==Float.POSITIVE_INFINITY); // true , static methods
     System.out.println(c==Float.NEGATIVITE_INFINITY);
     
     
    
   }


}