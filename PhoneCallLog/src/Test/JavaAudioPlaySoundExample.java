/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import sun.audio.*;

/**
 * A simple Java sound file example (i.e., Java code to play a sound file).
 * AudioStream and AudioPlayer code comes from a javaworld.com example.
 * @author alvin alexander, devdaily.com.
 */
public class JavaAudioPlaySoundExample
{
  public static void main(String[] args) 
  throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "F:/JSP/PCControler/src/Images/slow_motion.mp3";
    File audioFile = new File(gongFile);
           // "/Users/al/DevDaily/Projects/MeditationApp/resources/gong.au";
    InputStream in = new FileInputStream(audioFile);

    // create an audiostream from the inputstream
   // AudioStream audioStream = new AudioStream(in);
 
AudioInputStream audioStream = AudioSystem.getAudioInputStream(in);
    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
}
