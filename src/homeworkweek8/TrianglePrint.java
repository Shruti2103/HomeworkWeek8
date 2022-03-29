package homeworkweek8;
/*Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@ */
import java.util.Scanner;

public class TrianglePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int numberofRows = sc.nextInt();
        triangle(numberofRows);// direct call from static to static


    }

    public static void triangle(int a) {

        for (int i = 1; i <=a; i++) {//for loop for rows
            for (int j=1; j <= i; j++) {// for loop for colums
                System.out.print(j);
            }

            System.out.println();


        }

    }


}
