// Perimeter Class

import java.util.*;
import java.lang.*;

class Rectangle{

   public int length;
   public int breadth;
   
   public int area()
   {
     return length*breadth;
  }
  public int perimeter()
  {
    return 2*(length + breadth);
  }
}

public class RectangleClass{
  
   public static void main(String[] args)
   {
          Rectangle R1 = new Rectangle();
          R1.length = 4;
          R1.breadth = 3;
        
          System.out.println("Area of a rectangle is: "+ R1.area());
          System.out.println("Perimeter of a rectangle is: "+ R1.perimeter());
   }
}