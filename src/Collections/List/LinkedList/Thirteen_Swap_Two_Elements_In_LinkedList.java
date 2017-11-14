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
Before Swap[Apple, Banana, Mango, Grapes, PineApple, Guaue]
After Swap [Apple, Banana, Guaue, Grapes, PineApple, Mango]
*/
public class Thirteen_Swap_Two_Elements_In_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");
        list.add("PineApple");
        list.add("Guaue");
        System.out.println("Before Swap" + list);
        Collections.swap(list, 2, 5);
        System.out.println("After Swap " + list);
}
}
