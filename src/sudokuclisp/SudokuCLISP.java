    /*`                                                                                       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudokuclisp;

import java.io.File;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author daniar heri
 */
public class SudokuCLISP {

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThreadDemo T2 = new ThreadDemo( "ThreadGame");
                T2.start();     
                ThreadDemo T1 = new ThreadDemo( "ThreadMusic");
                T1.start();
            }
        });
    }
    
}
