package homeworkweek8;

import java.util.Scanner;

//Write a programme to input any number and check if it is prime or not.
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int x = sc.nextInt();


        PrimeNumber obj = new PrimeNumber();
        obj.x(x);

    }

    public boolean x(int a) {
        int rem;
        boolean x = true;
        //int a = 13;
        // loop to check weather the number is divisible by any number to check other than 1
        for (int i = 2; i <= a; i++) {
            rem = a % i;  // number to check it is divisible by itself
            if (rem == 0) {
                x = true;
                break;
            }
        }
        if (x) {
            System.out.println(a + "is Prime number");
        } else {
            System.out.println(a + "is not a Prime number");
        }


        return x;
    }


}

