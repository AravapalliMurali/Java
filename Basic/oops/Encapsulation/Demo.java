package oops.Encapsulation;

public class Demo {
    public static void main(String[] args) {

        PersonalDetails d1 = new PersonalDetails();
        d1.setDetails("murali", 26);

        System.out.println(d1.getAge() + " : " + d1.getName());
        // with the help of method we can fetch the values from private keyword 
        System.out.println(d1.age);
    }
}
