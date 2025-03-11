package therads;

import org.w3c.dom.css.Counter;

public class Demo {
    public static void main(String[] args) { 
        // InnerDemo obj = new InnerDemo(); 
        // InnerDemo_1 obj1 = new InnerDemo_1();

        Counter c1 = new Counter();

        Runnable obj = new InnerDemo(); // we are taking the interface referance and creating the class object 
        Runnable obj1 = () -> {
            for(int i=1;i<=100;i++){
                c1.increment();
                //System.out.println("hello");
                //try {Thread.sleep(10);} catch (InterruptedException e) { e.printStackTrace();}
            }
        };

        //when we implements from runnable than we have to create the thread object 
        Thread t1 = new Thread(obj); // here we need ro pass the object as a parameter to thread concustor 
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        // after completing the treads we have to join the both threads with main threads by using "jion()" method

        t1.join();
        t2.join();

        System.out.println(count);

        // for threads we have use the start() method to call the run method in classes always 
        // here we are giving the priority for the thread 
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj.getPriority()); // will get the thread priority 
        // System.out.println(obj1.getPriority());
        
        // obj.start();
        // obj1.start();
        
    }
    
}

/*note : her we can with implements instand of extends because multile inhertance is not support by java 
 * here we are using the parent class is runnable because it has run method 
 * if we use the above point then start() is not available in runnable then we have to create the Thread object in main class 
 */

public class InnerDemo implements Runnable{

    public void run(){
        for(int i=1;i<=100;i++){
            // here we are controlling the therad by waiting for printing the one "hi" by using the sleep method 
            // System.out.println("HI");
            // try {
            //     Thread.sleep(10);
            // } catch (InterruptedException e) { e.printStackTrace();}
            //c1.increment();
        }
    }
}

// here i am using the lamda and anonymous class for reduing the code for class 2 
// public class InnerDemo_1 implements Runnable{

//     public void run(){
//         for(int i=1;i<=100;i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) { e.printStackTrace();}
//         }
//     }
// }


/*note : 
 * here the concept is whenever we are working with same method with differents we have to make sync the both threads by using the keyword "synchronized"
 */

 public class counter {
    int count;
    public synchronized void increment(){
        count++;
    }
 }

 