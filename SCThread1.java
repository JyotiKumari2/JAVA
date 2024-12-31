// Challenge : ATM Machine 

import java.util.*;
import java.lang.*;

class ATM 
{

   synchronized public void checkBalance(String name)
                 {
                      
                     System.out.print(name+" Checking ");
                     try 
                     {
                        Thread.sleep(1000);
                     }
                     catch(Exception e){}
                     System.out.println("Balance");

                 }

 synchronized public void withdrawn(String name, int amount)
              {
                     System.out.print(name+" withdrawing ");
                     try
                     {
                       Thread.sleep(1000);
                     }
                     catch(Exception e){}
                     System.out.println(amount);

              }

}


class Customer extends Thread
{
    

    String name;
    ATM atm;
    int amount;
    
    Customer(String n, ATM a, int amt)
    {
      name=n;
      atm=a;
      amount=amt;
    }

    public void useATM()
    {
       
         atm.checkBalance(name);
         atm.withdrawn(name,amount);
    }

    public void run()
    {

          useATM();

    }
}

public class SCThread1
{
   
   public static void main(String[] args)
   {
    
     ATM atm = new ATM();
     Customer c1 = new Customer("Anjali", atm, 100);
     Customer c2 = new Customer("Sehaj", atm, 200);
     c1.start();
     c2.start();
   }

}