

// using single class


import java.lang.*;
import java.util.*;

public class ThreadTest2 implements Runnable
{

     public void run()
    {


        int i=1;
        while(true)
        {
           
          System.out.println(i+" Hello!");
          i++;

        }
    }
    public static void main(String[] args)
    {

        ThreadTest2 t= new ThreadTest2();
        Thread th = new Thread(t);
        th.start();
        
        int i=1;
        while(true)
        {
           
          System.out.println(i+ " World!");
          i++;

        }
          
    }

}