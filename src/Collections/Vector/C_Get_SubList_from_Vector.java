/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author prudviraj
 */
public class C_Get_SubList_from_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("A");
        vector.add("B");
        vector.add("D");
        vector.add("E");
        List<String> list = vector.subList(1, 3);
        System.out.println("Sublist : " + list);
    }
    
}
