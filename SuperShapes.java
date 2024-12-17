// Parameterized constructor

import java.util.*;
import java.lang.*;

class Rectangle{
 
   int length;
   int breadth;
    
   Rectangle()
   {
      System.out.println("Rectangle Constructor");
   }
   
   Rectangle(int l, int b)
   {
      length=l;
      breadth=b;
   }
}

class Cuboid extends Rectangle{

   int height;
   
   Cuboid()
   {
     System.out.println("Cuboid Constructor");
   }

   Cuboid(int h)
  {
   height = h;

  }

  Cuboid(int l, int b, int h)
  {

    super(l,b);
    height=h;
  }
   
  int volume()
  {
    
    return length*breadth*height;
  }


}

public class SuperShapes{

public static void main(String[] args)
{
   
   Cuboid c = new Cuboid(5,3,10);
   System.out.println(c.volume());

}

}
