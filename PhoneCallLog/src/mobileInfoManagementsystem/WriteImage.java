/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileInfoManagementsystem;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import sun.misc.BASE64Encoder;

public class WriteImage {
   

    public void imagepath(String imagefile) {
    File file=new File(imagefile);
        BufferedImage bimage=null;
        try {
            bimage = ImageIO.read(file);
            ImageIO.write(bimage,"png", new File("F:/output.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//    
////     public static void main(String[] args)
//    {    
//        File file = new File("I:/input.jpg");
//         
//        BufferedImage image = null;
//         
//        try
//        {
//            image = ImageIO.read(file);
//             
//            ImageIO.write(image, "jpg", new File("I:/output.jpg"));
//             
//            ImageIO.write(image, "png", new File("I:/output.png"));
//             
//            ImageIO.write(image, "gif", new File("I:/output.gif"));
//             
//            ImageIO.write(image, "bmp", new File("I:/output.bmp"));
//        } 
//        catch (IOException e) 
//        {
//            e.printStackTrace();
//        }
 
   /*
    Encode Image to Base64 String
    The below method will encode the Image to Base64 String. 
    The result will be a String consisting of random characters, 
    representing the image. This characters can then be save to the database.
    A blob type column is more applicable when saving an image 
    to the database since a blob column can hold large amount of data.
    */
    
 
//public void WriteImagetoSave(BufferedImage image) {
//        String imageString = null;
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
// 
//        try {
//            ImageIO.write(image, "png", new File("F:\\output.jpg"));
//            byte[] imageBytes = bos.toByteArray();
// 
//            BASE64Encoder encoder = new BASE64Encoder();
//            imageString = encoder.encode(imageBytes);
// 
//            bos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        
//    }
//
//}
//Decode Base64 String to Image
//public void decodeToImage(BufferedImage image, String type) {
// String imageString = null;
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//   
//        try {
//            ImageIO.write(image, type, bos);
//            byte[] imageBytes = bos.toByteArray();
// 
//            BASE64Encoder encoder = new BASE64Encoder();
//            imageString = encoder.encode(imageBytes);
// 
//            bos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//       
//    }

//   public static BufferedImage imageToBufferedImage(Image im) {
//     BufferedImage bi = new BufferedImage();
//       
//       try {
//            Graphics bg = bi.getGraphics();
//     bg.drawImage(im, 30, 30, null);
//     bg.dispose();
//     ImageIO.write(bi, ".png", new File("F:\\output"));
//       } catch (Exception e) {
//       }
//  
//      return null;
//  }
//
//   

   
 
}