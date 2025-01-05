// Method Reference

import java.util.*;
import java.lang.*;

interface MyLambda{
 
  public void display(String str);
}

public class LambdaDemo4{

   public static void reverse(String str)
   {
     StringBuffer sb = new StringBuffer(str);
     sb.reverse();
     System.out.println(sb);

   }
   public static void main(String[] args)
  {
    /* MyLambda ml = System.out::println;
     ml.display("Hello"); */
     
     MyLambda ml = LambdaDemo4::reverse;
     ml.display("Hello");
    
     
  }

}