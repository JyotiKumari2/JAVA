// Method overriding

import java.util.*;
import java.lang.*;


class Car{

   public void start() 
   {
      System.out.println("Car Started");
   }
   public void accelerate()
   {
     System.out.println("Car is accelerated");
   }
   public void changeGear()
   {
     System.out.println("Car Gear Changed");
   }
}

class LuxuryCar extends Car{

   public void changeGear()
   {
           System.out.println("Automatic Gear");
   }
   public void openRoof()
   {
     System.out.println("Sun Roof is opened");
   }

}

public class OverridingExample
{

    public static void main(String[] args)
    {

             Car c = new LuxuryCar();
             c.start();
             c.accelerate();
             c.changeGear();
             c.openRoof();
    }
}
