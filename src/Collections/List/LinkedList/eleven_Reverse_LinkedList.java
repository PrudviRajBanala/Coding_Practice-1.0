/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author prudviraj
 */
/*
OutPut
[A, B, C, D]
[D, C, B, A]
*/
public class eleven_Reverse_LinkedList {
    public static void main(String[] args) {
                LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
