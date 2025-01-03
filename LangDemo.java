// Object CLass
import java.lang.*;
import java.util.*;

// class MyObject{}  // inheriting from object class
public class LangDemo
{
     
   public static void main(String[] args)
  {
      Object o1 = new Object();
      Object o2 = new Object();
      System.out.print(o1.equals(o2));  // false because both are new objects
      System.out.println("HashCode: "+ o1.hashCode());

  }

}