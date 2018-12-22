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
public class Animal {
      public void callme()
    {
        System.out.println("In callme of Animal");
    }
}


class Dog extends Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}

 class UseAnimlas 
{
    public static void main (String [] args) 
    {
      Animal a=new Dog();//up Casting
      Dog d=(Dog) a;// Down casting.
     // a.callme();
      d.callme2();
      a.callme();
    }
}
