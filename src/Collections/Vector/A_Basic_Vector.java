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
public class A_Basic_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("A");
        vector.add("B");
        vector.add("D");
        vector.add("E");
        System.out.println(vector);
        vector.add(2, "C");
        System.out.println(vector);
        System.out.println("Element at index 3 : " + vector.get(3));
        System.out.println("First element of the vector is : " + vector.firstElement());
        System.out.println("Last element of the vector is : " + vector.lastElement());
        System.out.println("Is vector empty : " + vector.isEmpty());

        
    }
    
}
