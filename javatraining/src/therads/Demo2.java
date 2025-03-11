package therads;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException{
        Counter c1 = new Counter();
        Runnable obj1 = () ->{
            for(int i=1;i<=10000;i++){
                c1.increment();
            }
        };
        
        Runnable obj2 = ()->{
            for(int i =1;i<=10000;i++){
                c1.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // joinig the threads

        t1.join();
        t2.join();

        System.out.println(c1.count);

        
        
    }
}

/**
 * Counter
 */
public class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}