import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo {
    public static void main(String[] args) throws IOException, NumberFormatException{
        int num = 0;
        System.out.println("Enter the input ------");
        // here we are using the finally block for exceuting the important code and close the resource 
        
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){ // here only we can close the resocurse 
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        // finally{
        //     br.close();
        // }
    }
}
