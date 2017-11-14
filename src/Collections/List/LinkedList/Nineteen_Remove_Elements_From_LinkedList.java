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
[Banana, Mango, Grapes]
*/
public class Nineteen_Remove_Elements_From_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        System.out.println(list);
        list.remove();
        System.out.println(list);
    }
    
}
