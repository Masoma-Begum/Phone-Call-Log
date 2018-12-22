/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
public abstract class JodaDateDifferentExample {
     public static void main(String[] args) throws InterruptedException
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How much time (In Minutes) ?");
    int timet= scan.nextInt() * 60; // Convert to seconds
    long delay = timet * 1000;

    do
    {
      int minutes = timet % 60;
      int seconds = timet / 60;
      System.out.println(minutes +" minute(s), " + seconds + " second(s)");
      Thread.sleep(1000);
      timet = timet - 1;
      delay = delay - 1000;

    }
    while (delay != 0);
    System.out.println("Time's Up!");
  }
}
