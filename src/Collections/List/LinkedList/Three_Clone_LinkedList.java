/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author prudviraj
 */

/**
 * output
Actual LinkedList is - [Apple, Mango, Grapes, Banana]
Cloned LinkedList is - [Apple, Mango, Grapes, Banana]
 */
public class Three_Clone_LinkedList {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        list.add("Banana");
        System.out.println("Actual LinkedList is - " + list);
        LinkedList<String> clone = (LinkedList<String>) list.clone();
        System.out.println("Cloned LinkedList is - " + clone);
    }
    
}
