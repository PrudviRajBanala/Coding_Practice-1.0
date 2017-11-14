/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author prudviraj
 */
/*
OutPut
[A, B, C]
[A, B, C, 1, 2]
*/
public class Four_Adding_Arraylist_Elements_To_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        ArrayList<String> arraylist = new  ArrayList<String>();
        arraylist.add("1");
        arraylist.add("2");
        list.addAll(arraylist);
        System.out.println(list);
    }
    
}
