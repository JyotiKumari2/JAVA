// final keyword practice

import java.util.*;
import java.lang.*;


class Test{

   public final void show()
    {
      
      System.out.println("Hello");
    }

}

class test1 extends Test{

//

}

public class FinalDemo{

  public static void main(String[] args)
  {
    
      Test t = new Test();
      t.show();
     
  }

}