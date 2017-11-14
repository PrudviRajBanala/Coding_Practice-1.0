/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.Join_Method;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author prudviraj
 */
public class Join_Main {
    public static List<String> names = new ArrayList<String>();
     
    public static void main(String a[]){
        List<Join_Class> list = new ArrayList<Join_Class>();
        for(int i=0;i<5;i++){
            Join_Class s = new Join_Class();
            list.add(s);
            s.start();
        }
        for(Join_Class st:list){
            try{
                st.join();
            } catch (Exception ex){}
        }
        System.out.println(names);
    }
}
