/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.Sleep_Method;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author prudviraj
 */
public class Sleep_Main {
    
    public static void main(String[] args) {
        List<Sleep_Class> list =  new ArrayList<Sleep_Class>();
        for(int i = 0; i<4; i++){
            Sleep_Class sc = new Sleep_Class(i + 10);
            list.add(sc);
            sc.start();
        }
        for(Sleep_Class sc: list){
            try{
                sc.join();
            }catch(InterruptedException e){
                
            }
        }
    }
}
