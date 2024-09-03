public class variable {
    public static void main(String ar[]) {
        int num = 10_00_000;
        int num2 = 5;
        long lg = 578948l;
        short sh = 129;
        byte by = 23;
        char ch = 'l';
        boolean bool = true ;
        float fl = 78.90f;
        double db = 78.89343789;

        // conversion and casting 

        byte val = 78;
        int a = val; // conversion 
        System.out.println(a);

        int b = 257;
        byte val2 = (byte) b; // casting -> it will do the modlue operation (%) print the remainder value 
        System.out.println(val2);

        float num8 = 56.7f; // here it will loose the point values 
        int qa = (int)num8;
        System.out.println(qa);
        //int result = num + num2;
        //System.out.println(result);

        //type promotions 
        byte value1 =  10;
        byte value2 = 30;
        int result = value1 * value2;
        System.out.println(result); // type promotion -> here result value is crossing the byte range 
    }
}
