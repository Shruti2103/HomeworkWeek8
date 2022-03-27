package homeworkweek8;

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
        while (number != 0) {
            int b = number % 10;
            sum = (sum * 10) + b;
            number = number / 10;
        }

        if (temp == sum)
            message = true;
        else
            message = false;

        return message;


    }


}
