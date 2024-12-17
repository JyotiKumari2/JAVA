// this  super keyword

import java.util.*;
import java.lang.*;

class Rectangle
{

   int length;
   int breadth;
   int x = 10;

   Rectangle()
   {
     
    System.out.println("Rectangle Constructor");
    

   }
    
   Rectangle(int length, int breadth)
   {
       this.length=length;
       this.breadth=breadth;
   }

}

class Cuboid extends Rectangle{

    int height;
    int x = 20;
    
    Cuboid()
    {
        System.out.println("Cuboid Constructor");
    }
     
    Cuboid(int height)
    {
        
     this.height=height;

    }
    
    Cuboid(int length, int breadth, int height)
    {

       super(length,breadth);
       this.height=height;
    }
    
    void display()
   {
       System.out.println(super.x);
       System.out.println(x);
   }
}


class InheritRectanglCuboid
{

   public static void main(String[] args)
   {

         Cuboid c = new Cuboid(3,5,15);
         c.display();
   }


}