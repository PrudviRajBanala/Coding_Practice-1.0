/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.Sleep_Method;

/**
 *
 * @author prudviraj
 */
public class Sleep_Class extends Thread{
    
    public int suspend;
    public Sleep_Class(int count){
        this.suspend = count;
    }
    public void run(){
        for(int i=0; i<50; i++){
            if(i%suspend == 0){
                try{
                    System.out.println("Thread Sleep :" + getName());
                    Thread.sleep(500);
                }catch (InterruptedException e){
                }
            }
        }
    }
    
}
