package opps.inhertance;

public class Demo {
    public static void main(String[] args) {
        int r1,r2,r3;
        double r4;
        AdvCals cal = new AdvCals();
        r1 = cal.add(3, 5);
        r2 = cal.sub(4, 7);
        r3 = cal.multi(4, 7);
        r4 = cal.division(4, 6);
        

        System.out.println(r1 + " " + r2 + " " + r3 + " " +r4);

        // write calculator code here for inhertance
    }
}
