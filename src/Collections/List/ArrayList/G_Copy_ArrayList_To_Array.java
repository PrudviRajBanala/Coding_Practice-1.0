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
A
B
C
D
E
*/
public class G_Copy_ArrayList_To_Array {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        String [] arr = new String[array.size()];
        array.toArray(arr);
        for(String x : arr){
            System.out.println(x);
        }
    }
    
}
