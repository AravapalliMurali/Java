
public class demo {
    public static void main(String[] args) {
        
        class Mobile {
            int price;
            String brand;
            static String name;

            static{
                name = "smartPhone"; // static block -> it only run the one time when we load the class
                System.out.println("loaded the static block");
            }

            public void show(){ // instance method 
                System.out.println(brand + " " + price + " " + name);
            }
            public static void show1(Mobile obj){
                System.out.println("static method");
                System.out.println(obj.brand + " " + obj.price + " " + name);
            }
        }
          //Class.forName("Mobile");// we can load the class
        Mobile s1 = new Mobile();
        Mobile s2 = new Mobile();

        s1.brand = "apple";
        s1.price = 50_000;
        //s1.name = "13pro max";
        Mobile.name = "13promax";

        s2.brand = "apple";
        s2.price = 50_000;
        //s2.name = "13pro max";
        Mobile.name = "samsung f23 se";

        Mobile.name = "smartphone"; // static variable can access by every obj and effect the all objects 
        // here we can access the static variable via class also 
        
        s1.show();
        s2.show();

        Mobile.show1(s1);

    }
}
