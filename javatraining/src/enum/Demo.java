


public class Demo {
    public static void main(String[] args) {
        Status[] ss = Status.values();// it will give the array;//Status.Running;
        //System.out.println(s.ordinal());// for index valuse \
        //System.out.println(s);

        for(Status s : ss){ // enhance for loop 
            System.out.println(s + ":" +  s.ordinal());
        }

        // --- we can use this example for both switch and if else 

    }
}

enum Status{
    Running, failed, pending, Success;
}