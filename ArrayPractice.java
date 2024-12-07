// Array Practice

import java.util.*;
import java.lang.*;

public class ArrayPractice{

    public static void main(String[] args)
    {
          
         int[] arr = new int[5];
         int[] arr1 = {1,2,3,4,5};
         int c[];
         c = new int[10];
         
         for(int i=0;i<5;i++)
              arr[i] = i;
         for(int i:arr)
          System.out.print(i+" ");
    }
}