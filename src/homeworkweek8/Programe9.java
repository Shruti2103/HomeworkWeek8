package homeworkweek8;

import java.util.Scanner;

// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Programe9 {

    public static void main(String[] args) {
     Programe9 obj=new Programe9();
     obj.test();

    }

    public void test() {

        int n = 10;
        int n1 = 0;
        int n2 = 1;

        System.out.println("Enter Fibonacci number till " + n);

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ,");

            int n3 = n1 + n2;//1
            n1 = n2;//value of n1 we put on n2
            n2 = n3;//value of n2 we put in n3
        }

    }


}
