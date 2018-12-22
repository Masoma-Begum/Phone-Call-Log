/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author User
 */
public class passwordvalidation {
    public static void main(String[] args) {
      String passwd = "2222"; 
      String pattern = "(?=.*[0-9])";
      if(passwd.matches(pattern)){
          System.out.println("go to other page");
      }
   }
}
