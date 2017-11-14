/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator_Vs_Enumeration_Vs_ListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 *
 * @author prudviraj
 */
/*
OutPut
Forward Direction
1
2
3
4
5
Backward Direction
5
4
3
2

*/
public class D_Iterate_Elements_ListItertor {
        public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
            ListIterator<String> lIterator = list.listIterator();
            System.out.println("Forward Direction");
            while(lIterator.hasNext()){
                System.out.println(lIterator.next());
            }
            System.out.println("Backward Direction");
            while(lIterator.hasPrevious()){
                System.out.println(lIterator.previous());
            }
        
    }
}
