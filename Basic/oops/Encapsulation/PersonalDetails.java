package oops.Encapsulation;

public class PersonalDetails {
    public static void main(String[] args) {
        private int age;
        private String name;

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
