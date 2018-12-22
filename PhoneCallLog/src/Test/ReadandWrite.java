/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.awt.Image;
   import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author User
 */
public class ReadandWrite {

 
 
    
    public static void main(String[] args)
    {    
       
       File file = new File("C:\\Users\\User\\Desktop\\an.jpg");
         
        BufferedImage image = null;
         
        try
        {
           image = ImageIO.read(file);
             
           
             
           ImageIO.write(image, "png", new File("F:\\output.png"));
            
            
            ImageIO.write(image, "bmp", new File("F:\\output.bmp"));
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
         
        System.out.println("done");
   }
} 

