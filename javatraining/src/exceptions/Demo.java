package exceptions;

public class Demo {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;
        int nums[] = new int[5];
        String str = null ;
        try {
            j = 18/i;
            if(j == 0)
                throw new MuraliException("you got error"); 
                // by using the throw keyword we can call the catch method 
            //System.out.println(nums[1]);
            //System.out.println(nums[5]);
            //System.out.println(str.length());
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("cannot divide by zero...." + e);
        }catch (MuraliException e) {
            // TODO: handle exception
            System.out.println("cannot divide by zero...." + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }catch(Exception e){
            System.out.println("somthing went wrong...." + e);
        }

        System.out.println("bye");
    }
}

// here we can create the our own exception ny creating the class and extends from parents exceptions call and we can print the message by call the super class that which accepts the string 

// custom exception 

public class MuraliException extends Exception {
    public MuraliException(String string){
        super(string);
    }
}