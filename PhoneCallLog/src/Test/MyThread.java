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
public class MyThread extends Thread{
      
   
    public void run()
    {
        while (!Thread.interrupted())
        {
            System.out.println("I am running....");
        }
         
        System.out.println("Stopped Running.....");
    }
}



