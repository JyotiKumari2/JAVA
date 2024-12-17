// Dynamic Dispatch

import java.util.*;
import java.lang.*;

class Super{

    public void meth1()
    {

     System.out.println("Method1 of Super class called");
    }
   
    public void meth2()
    {

     System.out.println("Method2 of Super class called");
    }


}

class Sub extends Super{

    
   
    public void meth2()
    {

     System.out.println("Method2 of Sub class called");
    }

   public void meth3()
    {

     System.out.println("Method3 of Sub class called");
    }


}

class DynamicDispatch{

public static void main(String[] args)
{
 
 Super s = new Sub();
 s.meth1();
 s.meth2();

}

}