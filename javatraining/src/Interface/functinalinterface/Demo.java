package Interface.functinalinterface;

// by uisng the lameda ecxpersion ('-->')
public class Demo {
    public static void main(String[] args) {
        // using the lamda experssion we are reducing the code 
        A obj = (i,j) -> i+j;
        int result = obj.add(7,8);
        System.out.println(result);
        
    }   
}

@FunctionalInterface
interface A{
    int add(int i, int j);
}
