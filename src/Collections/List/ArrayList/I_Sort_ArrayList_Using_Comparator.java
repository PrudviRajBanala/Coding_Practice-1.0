/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author prudviraj
 */
/*
Output
Name = Prudvi2Salary = 700
Name = Prudvi3Salary = 1000
Name = PrudviSalary = 1000
Name = Prudvi1Salary = 5000
*/
public class I_Sort_ArrayList_Using_Comparator {
    
    String name;
    int Salary;

    public I_Sort_ArrayList_Using_Comparator(String name, int Salary) {
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
    public String toString(){
        return "Name = " + name + "Salary = " + Salary ;
        
    }
    
    public static class Second_Class  implements Comparator<I_Sort_ArrayList_Using_Comparator>{

        @Override
        public int compare(I_Sort_ArrayList_Using_Comparator o1, I_Sort_ArrayList_Using_Comparator o2) {
            if(o1.Salary > o2.Salary){
                return 1;
            }else{
                return -1;
            }
        }
    
}
    
    public static void main(String[] args) {
        List<I_Sort_ArrayList_Using_Comparator> array = new ArrayList<I_Sort_ArrayList_Using_Comparator>();
        array.add(new I_Sort_ArrayList_Using_Comparator("Prudvi", 1000));
        array.add(new I_Sort_ArrayList_Using_Comparator("Prudvi1", 5000));
        array.add(new I_Sort_ArrayList_Using_Comparator("Prudvi2", 700));
        array.add(new I_Sort_ArrayList_Using_Comparator("Prudvi3", 1000));
        Collections.sort(array, new Second_Class());
        for(I_Sort_ArrayList_Using_Comparator x : array){
            System.out.println(x);
        }

    }
    
}
