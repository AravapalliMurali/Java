
class A {
    
    public void show(){
        System.out.println(" in A ");
    }

    public void showCong(){
        System.out.println(" in a config");
    }
    
}
class B extends A {
    // i am overriding the show() method from A 
    public void show(){
        System.out.println(" In B ");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        
    }
}
