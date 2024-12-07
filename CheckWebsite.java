// Find Type of Websites

import java.util.*;
import java.lang.*;

public class CheckWebsite
{
   
   public static void main(String []args)
   {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL:");
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        if(protocol.equals("http"))
          System.out.println("Hyper text transfer protocol");
        else if(protocol.equals("ftp"))
          System.out.println("File Transfer Protocol");
        
        String ext  = url.substring(url.lastIndexOf(".")+1);  // extension
        if(ext.equals("com"))
          System.out.println("Commercial");
        else if(ext.equals("org"))
          System.out.println("Organisation");
        else if(ext.equals("net"))
          System.out.println("Network");
        else
          System.out.println("Enter correct URL");
          
   }

}