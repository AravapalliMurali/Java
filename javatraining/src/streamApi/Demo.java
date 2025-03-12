package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,5,67,78,65,45,6);// by using Arrays class also we can add the elements i array

        // Stream<Integer> s1 = nums.stream(); // we can not use the stream more than one time and it return the list 
        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e)-> c+e); // here reduce method will give the type value
        
        // mofifyed code 

        //int result = 
        Stream<Integer> sortedvalues = nums.stream() // for threads will go with parallelStream and aviod sorted() method 
                         .filter(n -> n%2 ==0)
                         .sorted();
                         //.map(n -> n*2)
                         //.reduce(0, (c,e)-> c+e);

        sortedvalues.forEach(n -> System.out.println(n));

        // for(int i = 0; i<=nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }

        // for(int n : nums){
        //     System.out.println(n);
        // }

        // here by using "forEach" we can print the all elements in array 

        //s3.forEach(n -> System.out.println(n)); // here consumer class is calling and rest is taking here 
        //System.out.println(result);

        // int sum = 0;
        // for(int n : nums){
        //     if(n%2 == 0){
        //         n = n*2;
        //         sum += n;
        //     }
        // }
        // System.out.println(sum);
        //System.out.println(nums);
 
    }
}
