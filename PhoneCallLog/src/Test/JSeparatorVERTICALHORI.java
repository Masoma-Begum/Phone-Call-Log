/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import javax.swing.JFrame;
import javax.swing.JSeparator;

/**
 *
 * @author User
 */
public class JSeparatorVERTICALHORI {
   public static void main(String[] a){
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    frame.add(new JSeparator(JSeparator.VERTICAL));

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
 
}
