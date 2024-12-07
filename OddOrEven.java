// Find number is odd or even

import java.util.*;
import java.lang.*;

public class OddOrEven{

   public static void main(String[] args)
{
          
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if((n&1)==1)
      System.out.println("Odd Number");
    else
     System.out.println("Even Number");
}
}