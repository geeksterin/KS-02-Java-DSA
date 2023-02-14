import java.util.Scanner;   // import the tool

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   // create the tool

        // System.out.print("Please input an integer value : ");
        // int a = scn.nextInt();  // to take input of integer type

        System.out.print("Input a String value : ");
        // String str = scn.nextLine(); // take input until end of line
        String str1 = scn.next();   // take input until find first space

        // System.out.println("Your value is : " + str);
        System.out.println("Your value is : " + str1);
    }
}