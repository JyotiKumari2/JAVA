// Pass Lambda Expressions as parameters

import java.util.*;
import java.lang.*;

interface MyLambda{
 
  public void display();

}

class UseLambda{

public void callLambda(MyLambda ml)
{

    ml.display();   
}

}

class Demo{

public void method1()
{
   UseLambda ul = new UseLambda();
   ul.callLambda(()->{System.out.println("Hello, World!");});
}

}

public class LambdaDemo3{

public static void main(String[] args)
{
   Demo d1 = new Demo();
   d1.method1();
}

}