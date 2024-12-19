// Local and static inner class

import java.util.*;
import java.lang.*;


abstract class My
{
  abstract public void show();

}


class Outer {

 public void display()
 {

     My m = new My(){
         
     public void show()
     {
       System.out.println("Hello");
     }

     };
     
    m.show();
 }
 
 }




class LocalInnerAbstract
{

public static void main(String[] args)
{
    Outer o = new Outer();
    o.display();


}

}

