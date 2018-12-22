/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.io.*;


public class TestTcpSms {

        /**
         * @param args
         */
        public static void main(String[] args) {
                try {
                        String host = "192.186.0.101";
                        int port = 9500;
                        String username = "admin";
                        String password = "abc123";

                        MyOzSmsClient osc = new MyOzSmsClient(host, port);
                        osc.login(username, password);

                        
                        String line = "Hello World";

                        System.out.println("SMS message:");

                        if(osc.isLoggedIn()) {
                                osc.sendMessage("+551122334455", line);
                                osc.logout();
                        }


                } catch (IOException e) {
                        System.out.println(e.toString());
                        e.printStackTrace();
                } catch (InterruptedException e) {
                        System.out.println(e.toString());
                        e.printStackTrace();
                }
        }
}