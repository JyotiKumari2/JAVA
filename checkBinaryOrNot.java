// Find if a number is binary or not?

import java.util.*;
import java.lang.*;


class checkBinaryOrNot
{
public static void main(String[] args)
{

    int b = 1010110011; 
    String s = String.valueOf(b);
    System.out.println(s.matches("[01]+"));
}

}