// Count the number of words in a string

import java.util.*;
import java.lang.*;

public class CountWords{

   pubic static void main(String[] args){
         
       String str = " abc  ghf   def jklfk";
       str = str.replaceAll("\\s+"," ").trim());
       String words[] = str.split("\\s");
       System.out.println(words.length);

   }
}