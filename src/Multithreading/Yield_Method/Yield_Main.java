/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.Yield_Method;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author prudviraj
 */
public class Yield_Main extends Thread{
    
    public static void main(String a[]){
        List<Yield_Class> list = new ArrayList<Yield_Class>();
        for(int i=0;i<3;i++){
            Yield_Class et = new Yield_Class(i+5);
            list.add(et);
            et.start();
        }
        for(Yield_Class et:list){
            try {
                et.join();
            } catch (InterruptedException ex) { }
        }
    }
}
