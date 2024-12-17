// Abstract class example

import java.util.*;
import java.lang.*;

abstract class Shape{

   abstract public void perimeter();
   abstract public void area();
   

}


class Circle extends Shape{

   int radius;
   @Override
   public void perimeter()
   {
       System.out.println("Circle perimeter: "+ 2*Math.PI*radius);
   }
   
  @Override
  public void area()
  {
    System.out.println("Circle Area: "+ Math.PI*radius*radius);
  }

}

class Rectangle extends Shape{

    int length;
    int breadth;

   @Override
   public void perimeter()
   {
     System.out.println("Rectangle Perimeter: "+ 2*(length + breadth));
   
   }

   @Override
   public void area()
   {
     System.out.println("Rectangle Area: "+ length*breadth);
   }

 
}


class AbstractClassExample{

public static void main(String[] args)
{
  Circle r = new Circle();
  r.radius = 3;
  Shape s = r;
    
   s.area();
   s.perimeter();
}


}