/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author prudviraj
 */
/*
Output
Before Delete : [A, B, C, D, E]
After Delete : []
*/
public class E_Delete_All_Elements_From_ArrayList {
    public static void main(String[] args) {
ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        System.out.println("Before Delete : " + array);
        array.clear();
        System.out.println("After Delete : " + array);
    }
    
}
