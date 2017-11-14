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
Output
[]
*/
public class Six_Delete_All_Elements_From_LinkedList_Using_Clear {
    
        public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.clear();
        System.out.println(list);
        // Time complexity for clear() method is O(n) and for removeall method is O(n^2).
    } 
}
