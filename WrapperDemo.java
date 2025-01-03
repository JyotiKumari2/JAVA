// Wrapper Class

import java.lang.*;
import java.util.*;

// Integer Class , Autoboxing & AutoUnboxing

public class WrapperDemo{

public static void main(String[] args)
{

   int m1 =15;
   Integer m2=Integer.valueOf("123");
   Integer m3=Integer.valueOf("1010",2);
   Integer m4=Integer.valueOf("A7",16);
   Integer m5=Integer.decode("0xA7");
   

  
   System.out.println(m3);
   System.out.println(m4);
   System.out.println(m5);
   System.out.println(Integer.parseInt("123")); // string --> int
   System.out.println(Integer.toBinaryString(40));
   

}

}