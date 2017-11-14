/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author prudviraj
 */

/*Output
Apple
Banana
Mango
Grapes
*/

public class Two_Read_All_Elements_In_LinkedList_Using_Iterator {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            
        }
    }
    
}
