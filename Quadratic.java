// Quadratic Equation

import java.util.*;
import java.lang.*;

public class Quadratic{

  public static void main(String[] args)
  {
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of a b and c:");
     int  a = sc.nextInt();
     int  b = sc.nextInt();
     int  c = sc.nextInt();
     
    double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
    double x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;

    System.out.println("Roots are: " + x1+ " " + x2);
     
  }
}