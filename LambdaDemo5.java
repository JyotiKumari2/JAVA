// Method Reference : If not static method

import java.util.*;
import java.lang.*;

interface MyLambda{

   public void display(String str);
}

public class LambdaDemo5
{
    
    public void reverse(String str) // No static method
    {
       StringBuffer sb = new StringBuffer(str);
       sb.reverse();
       System.out.println(sb);
    }
     
    public static void main(String[] args)
    {
       LambdaDemo5 ld = new LambdaDemo5();
       MyLambda ml = ld::reverse;
       ml.display("Hello");
    }

}