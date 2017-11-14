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
Before Swaping : [A, B, C, D, E]
After Swaping : [A, B, E, D, C]
*/
public class L_Swap_Two_ArrayList_Elements {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        System.out.println("Before Swaping : " + array);
        Collections.swap(array, 2, 4);
        System.out.println("After Swaping : " + array);
    }
    
}
