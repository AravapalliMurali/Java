package oops.Encapsulation;

public class PersonalDetails {
    public static void main(String[] args) {
        private int age; // this age varaiable is only accessble in same class we we declare with private keyword 
        private String name; // where time while creating the instance vaiable make it private then no one will not use it 

        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }

        public void setDetails(String name, int age){
            this.age = age; // this reffer current object
            this.name = name;
        }
    }
}
