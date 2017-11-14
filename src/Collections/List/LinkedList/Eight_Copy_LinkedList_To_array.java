/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author prudviraj
 */

/*
OutPut
A
B
C
D
*/
public class Eight_Copy_LinkedList_To_array {
    
                public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
                String [] x = new String[list.size()];
                        list.toArray(x);
                for(String y: x){
                    System.out.println(y);
               }
                }
    
}
