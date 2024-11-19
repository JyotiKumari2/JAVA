import java.util.*;
import java.lang.*;

public class Bitwise
{

  public static void main(String []args)
  {
     // swapping two numbers using bitwise operator
      
     int a = 10;
     int b = 5;
     a= a^b;
     b= a^b;
     a= a^b;
     System.out.println("a: "+a);
     System.out.println("b: "+b);

  }
}