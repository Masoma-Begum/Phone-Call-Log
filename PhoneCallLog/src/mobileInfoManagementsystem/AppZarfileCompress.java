/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileInfoManagementsystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JOptionPane;

public class AppZarfileCompress
{
    public  void zarfileCompress(File fromfile)
    {
    	byte[] buffer = new byte[1024];

    	try{

    		FileOutputStream fos = new FileOutputStream(fromfile+"Mobileinfo.zip");
    		ZipOutputStream zos = new ZipOutputStream(fos);
    		ZipEntry ze= new ZipEntry("testZipRAr.txt");
    		zos.putNextEntry(ze);
    		FileInputStream in = new FileInputStream(fromfile);

    		int len;
    		while ((len = in.read(buffer)) > 0) {
    			zos.write(buffer, 0, len);
    		}

    		in.close();
    		zos.closeEntry();

    		//remember close it
    		zos.close();

    		      JOptionPane.showMessageDialog(null,"Zip file Done !!!");

    	}catch(IOException ex){
    	   ex.printStackTrace();
    	}
    }
}
