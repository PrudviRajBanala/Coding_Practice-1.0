/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector;

import java.util.Vector;

/**
 *
 * @author prudviraj
 */
public class B_Copy_Vector_To_Array {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("A");
        vector.add("B");
        vector.add("D");
        vector.add("E");
        String [] array =  new String [vector.size()];
        vector.toArray(array);
        for(String x : array){
            System.out.println(x);
        }
    }
    
}
