
public class Demo1 {
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + ":" + lap.getPrice());
            // here i am printing the price because of helper methods are getter and setter methods
        }
    }
}

enum Laptop{
    macbook(1000), surface, thinkpad(600), dell(700); // these are nothing but methods

    private int price;// we are using in this class only

    private Laptop(){
        // default constructor 
        price = 400;

    }

    private Laptop(int price){
        this.price = price;
        System.out.println("in laptop" + ":" + this.name());
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
