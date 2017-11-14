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

/*
OutPut
true
false
 */
public class Seven_OneList_Elements_In_Another_List_OrNot {
    
            public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("C");
        list1.add("D");
                System.out.println(list.containsAll(list1));
        list1.add("E");
                System.out.println(list.containsAll(list1));
        // Time complexity for clear() method is O(n) and for removeall method is O(n^2).
    } 
    
}
