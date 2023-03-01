import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2 ======= find sum of num

        Scanner scn = new Scanner(System.in);
        // System.out.println("Enter a 3 digit number");
        // int num = scn.nextInt();

        // int num1 = num / 100;
        // int num2 = num % 100;
        // int num3 = num2 / 10;
        // int num4 = num2 % 10;

        // int sum = num1 + num3 + num4;
        // System.out.println("Sum of nums are : " + sum);

        // 3 ========== find square of all 3 numbers

        // System.out.println("Square of nums are : ");
        // System.out.println(num1 * num1);
        // System.out.println(num3 * num3);
        // System.out.println(num4 * num4);

        // ============
        // Math.pow(num1, 2)

        // ======== Palindrome =======================
        /*
         * some randome text
         * muti line text
         */
        // System.out.println("Enter a 3 digit number");
        // int num = scn.nextInt();

        // int num1 = num / 100;
        // int num2 = num % 100;
        // int num3 = num2 / 10;
        // int num4 = num2 % 10;

        // int rev = num4 * 100 + num3 * 10 + num1;

        // if ( num == rev ) {
        // System.out.println("it is a palindrome");
        // } else {
        // System.out.println("it is not a palindrome");
        // }

        // =======================================

        // System.out.println("Enter a 3 digit number");
        // int num = scn.nextInt();

        // int num1 = num / 100;
        // int num2 = num % 100;
        // int num3 = num2 / 10;
        // int num4 = num2 % 10;

        // int arm = (num4 * num4 * num4) + (num3 * num3 * num3) + (num1 * num1 * num1);
        // // int arm = Math.pow(num4, 3) + Math.pow(num3, 3) + Math.pow(num1, 3);
        // // Math.min(a, b)
        // // Math.max(a, b)

        // if ( num == arm ) {
        // System.out.println("it is a armstrong no");
        // } else {
        // System.out.println("it is not a armstrong no");
        // }

        // =============== find profit or loss ==============

        // int sp = scn.nextInt();
        // int cp = scn.nextInt();
        // if (cp == sp) {
        // System.out.println("Neither profit nor loss");
        // } else if (cp < sp) {
        // System.out.println("He is in Profit of " + (sp - cp));
        // } else {
        // System.out.println("He is in loss of " + (cp - sp));
        // }

        // check if it is a vowel or not =============================

        char ch = scn.next().charAt(0);

        // if (ch == 'a') {
        // System.out.println("it is a vowel");
        // } else if (ch == 'e') {
        // System.out.println("it is a vowel");
        // } else if (ch == 'i') {
        // System.out.println("it is a vowel");
        // } else if (ch == 'o') {
        // System.out.println("it is a vowel");
        // } else if (ch == 'u') {
        // System.out.println("it is a vowel");
        // } else {
        // System.out.println("it is a consonent");
        // }

        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //     System.out.println("it is a vowel");
        // } else {
        //     System.out.println("it is a consonent");
        // }

        // ===============================================

        int n = scn.nextInt();

        if ( n == 2 ) {
            System.out.println("having 28 or 29 days");
        } else if ( n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12 ) {
            System.out.println("having 31 days");
        } else if ( n == 2 || n == 4 || n == 6 || n == 9 || n == 11 ) {
            System.out.println("having 30 days");
        }

    }
}