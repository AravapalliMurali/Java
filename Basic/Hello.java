/**
 * Hello
 */
public class Hello { // mian class 
    public static void main(String ar[]) { // main method 
        System.out.print("hello world"); // printing the hello world 
        String name = new String("name"); // passing a default value in consercted 
        String names = "krishna"; // it will actomatically created a object in heap memory 
        System.out.println(name);


        StringBuffer sb = new StringBuffer("name"); // buffer will give 16 bytes space in heap memory
        System.out.println(sb.capacity()); // here it will add length of string to 16 bytes when we use capacity 
    }
    
}