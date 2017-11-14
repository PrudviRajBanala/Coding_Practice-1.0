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
Before Shuffle : [A, B, C, D, E]
After Shuffle : [D, C, A, B, E]
*/
public class K_Shuffle_Elements_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
                System.out.println("Before Shuffle : " + array);
        Collections.shuffle(array);
                System.out.println("After Shuffle : " + array);
    }
    
}
