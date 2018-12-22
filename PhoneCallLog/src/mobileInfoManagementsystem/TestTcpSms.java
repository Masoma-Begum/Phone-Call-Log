package mobileInfoManagementsystem;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



//public abstract class TestTcpSms {

//    TestTcpSms() {
//        try {
//                        String host = "localhost";
//                        int port = 9500;
//                        String username = "admin";
//                        String password = "abc123";
//
//                        MyOzSmsClient osc = new MyOzSmsClient(host, port);
//                        osc.login(username, password);
//
//                        
//                       String line = "Hello World";
//                         if(osc.isLoggedIn()) {
////                                osc.sendMessage("+551122334455", line);
//                            //osc.logout();
//                             osc.sendMessage("+551122334455", line);
//                                osc.logout();
//    
//                        }
//
//
//                } catch (IOException e) {
//                        System.out.println(e.toString());
//                        e.printStackTrace();
//                } catch (InterruptedException e) {
//                        System.out.println(e.toString());
//                        e.printStackTrace();
//                }
//        }}
public class TestTcpSms {
   
    
    String TestTcpSms(String toNumber, String toMessage,String stHost,String stPort,String stUsername,String stPassword) {
        ImageIcon icon =null;
        try {
            String host = stHost;
            int port = Integer.parseInt(stPort);
            String username =stUsername;
            String password =stPassword;

            MyOzSmsClient osc = new MyOzSmsClient(host, port);
            osc.login(username, password);

            if (osc.isLoggedIn()) {
                osc.sendMessage(toNumber, toMessage);
                osc.logout();
                  icon = new ImageIcon("F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\Images\\send.png");
            JOptionPane.showMessageDialog(null, "Send Message Successfullly", "Send Messsage Info", JOptionPane.INFORMATION_MESSAGE, icon); 
            }else{
                 icon = new ImageIcon("F:\\JSP\\dtasjd\\src\\mobileInfoManagementsystem\\Images\\Cancle.png");
            JOptionPane.showMessageDialog(null, "Dosen't Send for some error", "Send Messsage Info", JOptionPane.INFORMATION_MESSAGE, icon); 
            }
        } catch (IOException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return null;
       
    }
    

         
                
}