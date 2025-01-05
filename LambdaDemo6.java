// One more example for method reference 

import java.util.*;
import java.lang.*;

interface MyLambda{

  public int display(String s1, String s2);

}

public class LambdaDemo6{


  public static void main(String[] args)
  {
    MyLambda ml = String::compareTo;
    System.out.println(ml.display("Hello", "Hello")); // 0 means true
  }

}