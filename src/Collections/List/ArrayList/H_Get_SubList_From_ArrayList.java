/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prudviraj
 */
/*
Output
Actual ArrayList : [A, B, C, D, E]
Sub List : [C, D]
*/
public class H_Get_SubList_From_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        System.out.println("Actual ArrayList : " + array);
        List<String> list = array.subList(2, 4);
        System.out.println("Sub List : " + list);
    }
    
}
