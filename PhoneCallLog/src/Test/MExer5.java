/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class MExer5 {
    public static void main(String args[]) throws IOException

{

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String input;

    int i,a;

int[] arc;

System.out.print("Enter a string: ");

 input=  in.readLine();

 a= input.length();

System.out.println("Number of Characters: " + a);

 

arc = new int[a];

for (i= 0; i<= a; i++)

{

  if(i==3){
      
  }

}  

 

System.out.println("Number of Words: ");

 

System.out.println("Number of vowels: ");

System.out.println("Number of consonants: ");

System.out.println("In capital letters: "+ input.toUpperCase());

System.out.println("In small letters: "+ input.toLowerCase());

 

 

        System.out.println("In Reverse: ");

     

}

}
