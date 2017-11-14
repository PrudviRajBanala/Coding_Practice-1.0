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
[1, 2, 3, 4, 5]
Element At Index (1) - 2
Does List Contain '4' - true
[1, 2, 3, 3.5, 4, 5]
Is ArrayList Empty - false
Size Of ArrayList Is - 6
*/
public class A_One_Basic_ArrayList_Operation {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        System.out.println("Element At Index (1) - " + list.get(1));
        System.out.println("Does List Contain '4' - " + list.contains("4"));
        list.add(3, "3.5");
        System.out.println(list);
        System.out.println("Is ArrayList Empty - " + list.isEmpty());
        System.out.println("Size Of ArrayList Is - " + list.size());
    }
    
}
