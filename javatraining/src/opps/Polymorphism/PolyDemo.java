
class A {
    public void show(){
        System.out.println("In A class");
    }
}

class B extends A{ 
    public void show(){
        System.out.println(" In b class");
    }
    
}

class C extends A{ 
    public void show(){
        System.out.println(" In c class");
    }
    
}

public class PolyDemo {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}
