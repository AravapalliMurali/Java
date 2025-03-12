package sealed classes;

public class Demo {
    public static void main(String[] args) {
        
    }
}

/*
 * here for sealed classes we have to sealed all the permission for extends the child classes but here we can permit for choosen classes by using the below mentioned one
 * when we give permission to child classes that classes should be a searled or non-sealed or final classes then only it will execute 
 * for interfaces also it will work and for child classes we have to mentioned the sealed and non-sealed. Please check the below mentioned one
 */

 sealed class A extends Thread implements Cloneable premits B,C{

 }

 non-sealed class B extends A{

 }

 final class C extends A{

 }

 sealed interface x permits Y{

 }

 non-sealed interface Y extends x{

 }

 sealed class D extends B{

    // here in b class is non sealed because of that got permission for D to extends from B
 }