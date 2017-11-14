/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator_Vs_Enumeration_Vs_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author prudviraj
 */
/*
OutPut
Before Remove
[1, 2, 3, 4, 5]
After Remove
[1, 2, 4, 5]
*/
public class B_Remove_Elements_Using_Iterator_In_Collection {
    public static void main(String[] args) {
        String number = "3";
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println("Before Remove");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(number.equals(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println("After Remove");
        System.out.println(list);
        
    }
    
}
