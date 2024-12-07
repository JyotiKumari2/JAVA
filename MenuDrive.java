// Make a menu driven program for arithmetic operation

import java.util.*;
import java.lang.*;

public class MenuDrive
{

    public static void main(String[] args)
    {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("MENU");
      System.out.println("=====");
      System.out.println("ADD");
      System.out.println("SUB");
      System.out.println("MUL");
      System.out.println("DIV");
      System.out.println("Enter two numbers: ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter operation: ");
      String op = sc.nextLine();
      switch(op)
      {

           case "ADD" : System.out.println("Addition is: "+ (num1+num2));
                        break;
           case "SUB" : System.out.println("Subtraction is: "+ (num1-num2));
                        break;
           case "MUL" : System.out.println("Product is: "+ (num1*num2));
                        break;
           case "DIV" : System.out.println("Quotient is: "+ (num1/num2));
                        break;
           case "DEFAULT" : System.out.println("Enter valid operation");
                        break;

            
     }

    }

}