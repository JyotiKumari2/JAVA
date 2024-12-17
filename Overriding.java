// method overriding

import java.util.*;
import java.lang.*;


class TV
{

public void switchON()
{
  
    System.out.println("TV is switched ON");

}

public void changeChannel()
{
   System.out.println("TV Channel is changed");
}



}

class SmartTV extends TV
{
   @Override
   public void switchON()
   {
     System.out.println("Smart TV is switched ON");
   }

   @Override
   public void changeChannel()
   {
         System.out.println("Smart Channel TV is changed");
   }

}

public class Overriding
{
   
   public static void main(String[] args)
   {

      TV t = new SmartTV();
      t.switchON();
      t.changeChannel();
   }


}