// Demo: Multi-threading

// using single class


import java.lang.*;
import java.util.*;

public class ThreadTest1 extends Thread
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

        ThreadTest1 t= new ThreadTest1();
        t.start(); // start new thread
        
        int i=1;
        while(true)
        {
           
          System.out.println(i+ " World!");
          i++;

        }
          
    }

}