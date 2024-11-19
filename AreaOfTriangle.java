import java.util.*;
import java.lang.*;

public class AreaOfTriangle

{

   public static void main(String[] args)
   {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter three sides of a triangle:");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     
     float s = (a+b+c)/2f;
     double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Area is: "+ area);
   }
}