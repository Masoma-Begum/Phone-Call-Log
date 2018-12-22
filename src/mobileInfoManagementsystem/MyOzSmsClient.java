package mobileInfoManagementsystem;

import java.io.*;
import java.util.*;
import hu.ozeki.*;

public class MyOzSmsClient extends OzSmsClient {

    public MyOzSmsClient(String host, int port) throws IOException, InterruptedException {//Instance class argumentd constructor
        super(host, port);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void doOnMessageAcceptedForDelivery(OzSMSMessage sms) {
        Date now = new Date();

    }

    @Override
    public void doOnMessageDeliveredToHandset(OzSMSMessage sms) {
        Date now = new Date();

    }

    @Override
    public void doOnMessageDeliveredToNetwork(OzSMSMessage sms) {
        Date now = new Date();
        System.out.println(now.toString() + " Message delivered to network. ID: "
                + sms.messageId);
    }

    @Override
    public void doOnMessageDeliveryError(OzSMSMessage sms) {
        Date now = new Date();

    }

    @Override
    public void doOnMessageReceived(OzSMSMessage sms) {
        Date now = new Date();

    }

    public void doOnClientConnectionError(String errorCode, String errorMessage) {
        Date now = new Date();

    }

    @Override
    public void doOnClientConnectionError(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
