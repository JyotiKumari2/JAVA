// circle class

import java.util.*;
import java.lang.*;

class Circle {

   public int radius;
   public double area()
   {
     return Math.PI*radius*radius;
   }
   
   public double perimeter()
   {
         return 2*Math.PI*radius;
   }

};

public class CircleClass{
    
   public static void main(String[] args)
   {
          Circle c1 = new Circle();
          c1.radius = 5;
          System.out.println("Area of circle is: "+ c1.area());
          System.out.println("Perimeter of circle is: "+ c1.perimeter());
        
   }
}