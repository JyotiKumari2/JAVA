// Introduction to lambda expression

import java.util.*;
import java.lang.*;

@FunctionalInterface
interface MyLambda
{
  public void display();
}

public class LambdaDemo
{

   public static void main(String[] args)
{

    MyLambda m = new MyLambda(){

    public void display()
   {
       System.out.println("Hello, World!");
   }
    };
    /* MyLambda m = ()->{System.out.println("Hello, World!");};*/
    m.display();
}

}