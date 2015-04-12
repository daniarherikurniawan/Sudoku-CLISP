/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudokuclisp;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author daniar heri
 */
public  class ThreadDemo extends Thread {
   private Thread t;
   private String threadName;
   
   ThreadDemo( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
       if(threadName.compareTo("ThreadMusic")==0){
           while(!SudokuPanel.exit){
                MakeSound sound = new MakeSound();
                sound.playSound("music/BackSound.wav");
           }
       }else{
            new MainFrame().setVisible(true);
       }
   }
   
   public void start ()
   {
       System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }//
       
   }

}