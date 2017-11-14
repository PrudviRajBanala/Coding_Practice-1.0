/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author prudviraj
 */
/*
OutPut
name=Rajesh, Salary=1000
name=Sudheer, Salary=3000
name=Prudvi, Salary=8000
name=Babu, Salary=12000
*/
public class Ten_Sort_LinkedList_Using_Comparator {
    
    String name;
    int Salary;

    public Ten_Sort_LinkedList_Using_Comparator(String name, int Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", Salary=" + Salary;
    }
    
    // Comparator Class
    public static class Second_Class implements Comparator<Ten_Sort_LinkedList_Using_Comparator>{

        @Override
        public int compare(Ten_Sort_LinkedList_Using_Comparator o1, Ten_Sort_LinkedList_Using_Comparator o2) {
            if(o1.getSalary() > o2.getSalary()){ // Change here for Descending Order
                return 1;
            }else{
                return -1;
            }
        }
        
    }

        // Main method
    public static void main(String[] args) {
        LinkedList <Ten_Sort_LinkedList_Using_Comparator> list = new LinkedList<>();
        list.add(new Ten_Sort_LinkedList_Using_Comparator("Prudvi", 8000));
        list.add(new Ten_Sort_LinkedList_Using_Comparator("Sudheer", 3000));
        list.add(new Ten_Sort_LinkedList_Using_Comparator("Rajesh", 1000));
        list.add(new Ten_Sort_LinkedList_Using_Comparator("Babu", 12000));
        Collections.sort(list, new Second_Class());
        for(Ten_Sort_LinkedList_Using_Comparator e : list){
            System.out.println(e);
        }
    }
    
}
