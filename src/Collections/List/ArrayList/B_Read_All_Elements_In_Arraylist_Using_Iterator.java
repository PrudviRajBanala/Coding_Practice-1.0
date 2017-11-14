package List.ArrayList;


import java.util.ArrayList;
import java.util.Iterator;

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
A
B
C
D
E
*/
public class B_Read_All_Elements_In_Arraylist_Using_Iterator {
    public static void main(String[] args) 
    {
        ArrayList <String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        Iterator <String> iterator = array.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
      
        }
        
    }
    
}
