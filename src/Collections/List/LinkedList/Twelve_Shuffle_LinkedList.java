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
Output
[A, B, C, D]
[B, C, D, A]
*/
public class Twelve_Shuffle_LinkedList {
    public static void main(String[] args) {
                LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
