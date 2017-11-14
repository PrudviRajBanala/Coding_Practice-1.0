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

/**
 * Output
 * 
[Apple, Banana, Grape]
Size of linked list is - 3
Is linked list empty - false
Does Linked List Contains 'mango' - false
The first element in the list is - Apple
The last element in the list is - Grape
HashCode of List - -2027151395
Index of 'Grape' in List - 2
 */
public class One_Basic_LinkedList_Operation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        System.out.println(list);
        System.out.println("Size of linked list is - " + list.size());
        System.out.println("Is linked list empty - " + list.isEmpty());
        System.out.println("Does Linked List Contains 'mango' - " + list.contains("Mango"));
        System.out.println("The first element in the list is - " + list.getFirst());
        System.out.println("The last element in the list is - " + list.getLast());
        System.out.println("HashCode of List - " + list.hashCode());
        System.out.println("Index of 'Grape' in List - "+ list.indexOf("Grape")); 
    }
    
}
