package homeworkweek8;

// Display left angle triangle of * using nested for loops
// *
// * *
// * * *
// * * * *
// * * * * *
public class Programe15 {

    public static void main(String[] args) {
        Programe15.test();


    }

    public static void test() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
