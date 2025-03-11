package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException{
        System.out.println("enter the number :");

        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        System.out.println(result);
        // another method 
        // InputStreamReader in = new InputStreamReader(System.in); // we are taking from system in method
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();// we are closing the buffer reader

        // amnother method 
        //int result = System.in.read(); // it will read one charcater at a time and give the ascii values only 
        //System.out.println(result - 48 );
    }
}
