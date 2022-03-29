package homeworkweek8;
/*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes. */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int inputnumber = sc.nextInt();
        System.out.println(isPalindrome(inputnumber));
    }

    public static boolean isPalindrome(int number) {

        int sum = 0;
        boolean message;
        int temp = number;
        while (number != 0) {// if no is not equal to 0
            int b = number % 10;// to get last digit no from user input
            sum = (sum * 10) + b;//to sum for last digit and other digit
            number = number / 10;// to get first digit from user input
        }

        if (temp == sum)
            message = true;
        else
            message = false;

        return message;


    }


}
