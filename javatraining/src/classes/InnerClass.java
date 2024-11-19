
/**
 * InnerInnerClass
 */
class InnerInnerClass {
    int age;
    String name;

    public void show(){
        System.out.println(" in A class");
    }
    /**
     * InnerInnerClass_1
     */
    static class InnerInnerClass_1 {
    
        public void show(){
            System.out.print("In  B class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        InnerInnerClass obj = new InnerInnerClass();
        obj.show();
        // declaring the new calls object 
        //InnerInnerClass.InnerInnerClass_1 obj1 = obj.new InnerInnerClass_1(); // without the static class 
        InnerInnerClass.InnerInnerClass_1 obj1 = new InnerInnerClass.InnerInnerClass_1();
        obj1.show();
    }
}
