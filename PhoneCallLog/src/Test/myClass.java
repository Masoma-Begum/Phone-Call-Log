/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.image.BufferedImage;
import javax.swing.*;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class myClass extends JFrame{
    JLabel lblSlideImage;
       Timer t;
    int x = 0;
    String[] imgList = {
        "F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\gp.png",//0
        "F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\rb.jpg",//1
        "F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\bl.PNG",//2
        "F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\tt.PNG",//3
        "F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\art.PNG"//4
    };
    //...........................................................................

    public myClass() {
       super("jafjf");
        
            lblSlideImage = new JLabel();
            lblSlideImage.setBounds(40, 30, 700, 300);
            setImageSize(4);
            t = new Timer(1000, new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    setImageSize(x);
                    x += 1;
                    if (x >= imgList.length) {
                        x = 0;
                    }
                }
            });
            add(lblSlideImage);
            
            t.start();
            setLayout(null);
            setSize(800,400);
           // getContentPane().setBackground(Color.decode("#bdb67b"));
           // setLocationRelativeTo(null);
               
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
    }
    private void setImageSize(int i) {
        ImageIcon ii = new ImageIcon(imgList[i]);
        Image im = ii.getImage();
        Image newimage = im.getScaledInstance(lblSlideImage.getWidth(), lblSlideImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newimageIcon = new ImageIcon(newimage);
        lblSlideImage.setIcon(newimageIcon);
    }
    public static void main(String[] args) {
        new myClass();
    }
}
