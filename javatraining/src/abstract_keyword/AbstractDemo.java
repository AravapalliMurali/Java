
/**
 * AbstractDemo
 */
public class AbstractDemo {
    public static void main(String[] args) {
        InnerAbstractDemo_1 obj = new InnerAbstractDemo_1();
        obj.drive();
        obj.playMusic();
        
    }
}

abstract class InnerAbstractDemo { // abstrat class

    public abstract void drive();

    public void playMusic(){
        System.out.println("play music sysyem ");
    }
}

/**
 * InnerAbstractDemo_1
 */
class InnerAbstractDemo_1 extends InnerAbstractDemo{ // concrete class

    public void drive(){
        System.out.println("driving the hounda class ");
    }
}

