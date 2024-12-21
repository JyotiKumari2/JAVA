// static members and methods example

import java.util.*;
import java.lang.*;

class HondaCity{

static long price =10;
int a,b;

static double onRoadPrice(String city){

 switch(city)
 {
 
  case "delhi": return price+price*0.01;
  case "Mumbai" : return price+price*0.05;

  }
return -1;
}


}

public class StaticHondaCity{

public static void main(String[] args)
{
     HondaCity h = new HondaCity();
     System.out.println(h.price);
}

}