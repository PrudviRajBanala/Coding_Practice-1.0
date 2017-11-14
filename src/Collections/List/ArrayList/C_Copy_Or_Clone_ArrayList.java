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
Actual ArrayList: [A, B, C, D, E]
Cloned ArrayList: [A, B, C, D, E]
*/
public class C_Copy_Or_Clone_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        System.out.println("Actual ArrayList: " + array);
        ArrayList<String> clone = (ArrayList<String>) array.clone();
        System.out.println("Cloned ArrayList: " + clone);
    }
    
}
