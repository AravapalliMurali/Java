package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        // i am writing the own login by using the compartor class for making own logic for sorting 

        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };


        // i am going to use the sorting 
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(66);
        nums.add(11);
        nums.add(15);

        Collections.sort(nums, com);

        System.out.println(nums);

    }
}

