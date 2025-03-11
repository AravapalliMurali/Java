package exceptions.throwsException;

public class Demo {

    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println("class not fount----" + e);
            //e.printStackTrace();// it will help to track the exception messages from scratch 
        }

    }
}

public class A {
    // i am asking the main method to take care of class exception by shown below 
    public void show() throws ClassNotFoundException {
        Class.forName("cals");
    }
}
