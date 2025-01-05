// Parameters in Lambda Expression-- example 1

import java.util.*;
import java.lang.*;

@FunctionalInterface
interface MyLambda
{
   
   public void display(String str);
}

public class LambdaDemo1  // Parameters in lambda expression
{
   
   public static void main(String[] args)
   {
     
     MyLambda m = (s)->{System.out.println(s);};
     m.display("Hello,World!");
      
   }   

}