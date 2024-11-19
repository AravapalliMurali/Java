
public class Anonymous {
    public static void main(String[] args) {

        InnerAnonymous obj = new InnerAnonymous(){
            public void show(){
                System.out.println( " In anonymous class");
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
