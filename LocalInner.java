// Local and static inner class

import java.util.*;
import java.lang.*;

class Outer {

 public void display()
 {

   class Inner{
     
      public void show()
      {
      
       System.out.println("Hello Inner class");

      }
   }
   
   new Inner().show();
 }

}


class LocalInner
{

public static void main(String[] args)
{
    Outer o = new Outer();
    o.display();


}

}

