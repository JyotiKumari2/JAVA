//cuboid 

import java.util.*;
import java.lang.*;

public class Cuboid
{

   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length breadth height:");
      int l = sc.nextInt();
      int b = sc.nextInt();
      int h = sc.nextInt();
      
      int totalArea = 2*(l*b + b*h * h*l);
      int volume = l*b*h;
     
      System.out.println("Area is: "+ totalArea);
      System.out.println("Vlume is: "+ volume);
   }
}