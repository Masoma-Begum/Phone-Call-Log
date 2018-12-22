/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileInfoManagementsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class CreateMinuteSecond extends Thread {

    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeStringMinute = "";
    String timeStringSecond = "";
//    String fullTimeho="";
     
    CreateMinuteSecond() {//Default class constroctor(non argumented no access modifier)
        t = new Thread(this);
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        try {
              while (!t.interrupted()){

                Calendar cal = Calendar.getInstance();

                hours = cal.get(Calendar.HOUR_OF_DAY);

                if (hours > 12) {
                    hours -= 12;
                }
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatterSec = new SimpleDateFormat("ss am");
                Date datesec = cal.getTime();
                timeStringSecond = formatterSec.format(datesec);

                SimpleDateFormat formatterMin = new SimpleDateFormat("mm");
                Date datemin = cal.getTime();
                timeStringMinute = formatterMin.format(datemin);

                if (timeStringMinute.equals("60")) {
                    fullTime();
                    /*
                     No need Decleration of dateformate cause formate is decleard on main class globally.
                     */
//                     SimpleDateFormat fullHourTime = new SimpleDateFormat("hh");
//                Date datehourtime = cal.getTime();
//                fullTimeho= formatterMin.format(datemin);
                }
                printTime();
           
            }
          } catch (Exception e) {
        }
    }

    public abstract void printTime();

    public abstract void fullTime();
}
 

