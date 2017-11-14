/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author prudviraj
 */
/*
Output
Before Reverse : [A, B, C, D, E]
After Reverse : [E, D, C, B, A]
*/
public class J_Reverse_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        System.out.println("Before Reverse : " + array);
        Collections.reverse(array);
        System.out.println("After Reverse : " + array);
    }
}
