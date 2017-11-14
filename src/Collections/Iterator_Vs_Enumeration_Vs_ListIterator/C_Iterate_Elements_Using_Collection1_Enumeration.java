/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator_Vs_Enumeration_Vs_ListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author prudviraj
 */
/*
OutPut
1
2
3
4
5
*/
public class C_Iterate_Elements_Using_Collection1_Enumeration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Enumeration<String> enu  = Collections.enumeration(list);
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
        
    }
    
}
