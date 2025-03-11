package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        /*note 
         * for collection there is not index values 
         * but for List we can access the index values and support the same elements in array 
         * when comes to sets it will only provide the unique elements in array 
         */
        //Collection<Integer> nums = new ArrayList<Integer>(); // with the help of generic we can mention the colletion type and if you not mention the type it will take it as obj 

        // going with List
        //List<Integer> nums = new ArrayList<Integer>();

        // with sets

        //Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>(); // we can go with the collection also here by replacing with set

        // when we use treeset it will give in sorted formated 

        nums.add(45);
        nums.add(47);
        nums.add(48);
        nums.add(49);
        nums.add(49);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // for(int n:nums){
        //     System.out.println(n*2);
        // }

        //System.out.println(nums);

    }
}
