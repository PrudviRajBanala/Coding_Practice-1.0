/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.Yield_Method;

import static java.lang.Thread.yield;

/**
 *
 * @author prudviraj
 */
public class Yield_Class  extends Thread{
    
        private int stopCount;
    public Yield_Class(int count){
        this.stopCount = count;
    }
    public void run(){
        for(int i=0;i<50;i++){
            if(i%stopCount == 0){
                System.out.println("Stoping thread: "+getName());
                yield();
            }
        }
    }
}
