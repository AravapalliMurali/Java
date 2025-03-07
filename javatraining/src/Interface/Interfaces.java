
package Interface;

public class Interfaces {
    public static void main(String[] args) {
        A obj = new dev(); // using the referance of interface and creating the claas object of dev
        obj.config();
    }
}

// class - > class - extends
// interface to interface - extends
// class to interface - implements

/**
 * interface
 */
public interface A 
{
    // for palning and designing perpose only 
    void show();
    void config();
}

/**
 * interface
 */
public interface B 
{
    void run();    
}
/**
 * interface
 */
public interface C extends B {

    
}

// multiple inetrface we can use for ths class here \

class dev implements A,C
{
    public void show(){
        System.out.println("SHOW IN CLASS");
    }
    public void config(){
        System.out.println("config in calss");
    }
    public void run(){
        System.out.println(" run in class ");
    }
}


