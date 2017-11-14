/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author prudviraj
 */
/*
OutPut
[C, D, E]
*/
public class Nine_Get_SubList_From_LinkedList {
 
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        List<String> list1 = list.subList(2, 5);
        System.out.println(list1);
    }
}
