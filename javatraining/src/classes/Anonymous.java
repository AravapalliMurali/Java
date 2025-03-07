
public class Anonymous {
    public static void main(String[] args) {

        InnerAnonymous obj = new InnerAnonymous(){
            public void show(){
                System.out.println( " In anonymous class");
            }
            public void show1(){
                System.out.println(" show in anonymous class");
            }
        };
        obj.show();
        
    }
}


/**
 * InnerAnonymous
 */
class InnerAnonymous {
    int age;
    String name;

    public void show(){
        System.out.println(" in A class");
    }
    
}

//abstract class
abstract package classes;

class InnerAnonymous_1 {
    public abstract show();
    public abstract shown();
}
