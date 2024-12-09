// Multiply 2-D array

import java.util.*;
import java.lang.*;

public class MultiplyMatrix
{

   public static void main(String[] args)
   {

        int a[][] = {{1,2,3}, {5,6,7},{8,9,0}};
        int b[][] = {{0,9,8}, {7,6,5},{3,2,1}};
        int c[][] = new int[3][3];
        
        for(int i=0;i<3;i++)
        {
           for(int j=0;j<3;j++)
            {
                c[i][j] = 0;
                 
                for(int k=0;k<3;k++)
                {
                   c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                } 
            }
        } 
      
         for(int []x:c)
         {
                for(int y:x)
                   System.out.print(y+" ");
                System.out.println("");
         }
   }
}