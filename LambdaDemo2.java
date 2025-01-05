// Parameters in lambda expression -- Example 2

import java.util.*;
import java.lang.*;

@FunctionalInterface
interface MyLambda
{
   public int add(int x, int y);
}

public class LambdaDemo2
{
  
   public static void main(String[] args)
   {
     /* MyLambda m = (a,b)->{return a+b; };
     System.out.println(m.add(20,30)); */

     // Also we can write it as
     MyLambda m = (a,b)->a+b;
     int r = m.add(20,30);
     System.out.println(r);

   }


}