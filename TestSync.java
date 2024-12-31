// Synchronization


import java.util.*;
import java.lang.*;

class MyData  
{

    synchronised void display(String str)  // shared data
   {

        for(int i=0;i<str.length();i++)
        System.out.print(str.charAt(i));
        System.out.println("");
   }


}

class MyThread1 extends Thread
{
   MyData d;
   
   MyThread1(MyData dat)
   {
     d=dat;
   }
   
   public void run()
   {
     
     d.display("hello World!");
     
   }

}

class MyThread2 extends Thread
{
   MyData data;
   
   MyThread2(MyData dat)
   {
     data=dat;
   }
   
   public void run()
   {
     
     data.display("welcome");
     
   }

}

public class TestSync
{

   public static void main(String[] args)
   {

       MyData d = new MyData();
       MyThread1 t1 = new MyThread1(d);
       MyThread2 t2 = new MyThread2(d);
       t1.start();
       t2.start();

   }

}