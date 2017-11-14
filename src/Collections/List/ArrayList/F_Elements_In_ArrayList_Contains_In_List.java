/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prudviraj
 */
/*
Output
Does ArrayList Contains all List elements : true
Does ArrayList Contains all List elements : false
*/
public class F_Elements_In_ArrayList_Contains_In_List {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        System.out.println("Does ArrayList Contains all List elements : " + array.containsAll(list));
        list.add("Z");
        System.out.println("Does ArrayList Contains all List elements : " + array.containsAll(list));
        
    }
    
}
