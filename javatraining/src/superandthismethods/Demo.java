package superandthismethods;

class A extends Object{ // every class is extends to Object class
    public A(){
        super();
        System.out.println(" in A");
    }
    public A(int n ){
        super();
        System.out.println("in A " + n);
    }
}

class B extends A {
    public B(){
        super();
        System.out.println(" in b ");
    }

    public B(int n ){
        this(); // calls the current super call 
        System.out.println("in b" + n);
    }
}


public class Demo {
    public static void main(String[] args) {
        B b1 = new B(7);
    }
}
