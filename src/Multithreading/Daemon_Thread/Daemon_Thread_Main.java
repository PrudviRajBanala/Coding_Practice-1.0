/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.Daemon_Thread;

import java.awt.BorderLayout;
import javax.sound.midi.Soundbank;

/**
 *
 * @author prudviraj
 */
public class Daemon_Thread_Main extends Thread{
    
    public Daemon_Thread_Main(){
        setDaemon(true);
    }
    
    public void run(){
        System.out.println(isDaemon());
    }
    
    public static void main(String[] args) {
        Daemon_Thread_Main dtm = new Daemon_Thread_Main();
        dtm.start();
        System.out.println("Result");
    }
}
