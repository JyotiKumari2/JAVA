// static blocks

import java.util.*;
import java.lang.*;

class Test{

  static{
  
    System.out.println("Block 1");

  }
  
  static{

     System.out.println("Block 2");
   }

}

public class StaticBlockPractice{

  public static void main(String[] args)
  {
   
   Test t = new Test();
   System.out.println("Main");

  }

}