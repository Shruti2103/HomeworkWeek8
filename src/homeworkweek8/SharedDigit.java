package homeworkweek8;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any digit");
        int a = sc.nextInt();
        System.out.println("Enter another digit");
        int b = sc.nextInt();
        System.out.println(hasSharedDigit(a, b));


    }

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;


        }
        while (a > 0) {
            int b1 = a % 10;
            int b2 = b % 10;// new int
            int a1 = a / 10;
            int a2 = b / 10;// new int
            if ((b1 == b2) || (b1 == a2) || (a2 == b1) || (a1 == b2)) {
                return true;
            }
            a /= 10;
            b /= 10;

        }


        return false;


    }


}
