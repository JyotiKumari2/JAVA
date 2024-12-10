// Cylinder Class

import java.util.*;
import java.lang.*;

class Cylinder{

  public int radius;
  public int height;

  public double area()
  {
     return Math.PI*radius*radius*height;
  }

  public double perimeter()
  {
      return 2*Math.PI*radius*height;
  }
}


public class CylinderClass{

    public static void main(String[] args)
    {
       
         Cylinder C1 = new Cylinder();
         C1.radius = 3;
         C1.height = 5;
         
         System.out.println("Area of a cylinder is: "+ C1.area());
         System.out.println("Perimeter of a cylinder is: "+ C1.perimeter());
    }

}