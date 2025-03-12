
public class Demo {
    public static void main(String[] args) {
        InnerDemo s1 = new InnerDemo(2, "murali");
        InnerDemo s2 = new InnerDemo(54, "murali");

        System.out.println(s1.equals(s2));
        System.out.println(s1.name()); // get() is not work here just give the variable name itself as method 
        
    }
}
/*
 * in java to hold the records and we reduce the code by without using the all getter and setter methods and tostrin, consctor for holding the data in class 
 * for that we are using record classes with the keyword "record"
 
 */

 /**
  * InnerDemo
  */
 public record InnerDemo(int id, String name) implements Cloneable{
    // here we get all the tostring methods and parametized concustor 
    // we can create the static variables but not the instance variables 
    // only we can pass by parameter in record class  and we can declare the methods too 
    public InnerDemo{
        // cannonical concustor 
        if(id == 0)
            throw new IllegalArgumentException(" id is not available please check ........");
    }

 }