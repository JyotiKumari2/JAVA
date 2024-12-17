// Abstract Example

import java.util.*;
import java.lang.*;


abstract class Super{

  public Super()
  {
     System.out.println("Super Constructor");
  }
  
   abstract public void meth2();

}

class Sub extends Super{

  @Override
  public void meth2()
  {

   System.out.println("Sub meth2");
  }

}

public class AbstractExample

{

  public static void main(String[] args)
  {
  
    Super s = new Sub();
    s.meth2();

  }




}
