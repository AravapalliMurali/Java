package oops;

class Innerdemo {
    //creating object and class
    //creating class
    int a;
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}
public class demo {
    public static void main(String[] args) {
        int num1 =4,num2=5;

        //method add()
        // need referance obj 
        Innerdemo cal = new Innerdemo();
        int result = cal.add(num1,num2);
        System.out.println(result);
    }
    
}

