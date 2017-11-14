/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.Join_Method;

/**
 *
 * @author prudviraj
 */
public class Join_Class extends Thread{
    
    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(10);
            } catch(Exception ex){}
        }
        Join_Main.names.add(getName());
    }
}
