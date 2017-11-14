package List.ArrayList;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudviraj
 */
/*
Output
Actual ArrayList : [A, B, C, D, E]
After Adding List to Arraylist : [A, B, C, D, E, F, G]
*/
public class D_Add_All_Elements_Of_List_To_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        System.out.println("Actual ArrayList : " + array);
        List <String> list = new ArrayList<String>();
        list.add("F");
        list.add("G");
        array.addAll(list);
        System.out.println("After Adding List to Arraylist : " + array);
    }
}
