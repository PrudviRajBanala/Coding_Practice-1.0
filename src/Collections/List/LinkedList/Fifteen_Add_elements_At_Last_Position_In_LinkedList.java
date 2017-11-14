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
[Apple, Banana, Mango, Grapes]
Add Element at the end of the list 
[Apple, Banana, Mango, Grapes, Papaya]
*/
public class Fifteen_Add_elements_At_Last_Position_In_LinkedList {
        public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        System.out.println(list);
        list.addLast("Papaya");
        System.out.println("Add Element at the end of the list ");
        System.out.println(list);
    }
}
