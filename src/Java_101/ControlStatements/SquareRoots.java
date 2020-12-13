package Java_101.ControlStatements;

import java.util.Scanner;

public class SquareRoots {
    /*
        Analysis:
        (a + 2^0 * b),(a + 2^0 * b +2^1 *b), ... ,(a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)
        for 0 2 10 => a = 0, b=2, n=10
        s0 = 0 + 1 * 2 = 2
        s1 = 0 + 1 * 2 + 2 * 2 = 6
        s2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14
        .
        .
        .
        till n = 10;

     Each line will all s0 ... s10 in one line separated by space
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        System.out.println("current t is: " + t);
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            System.out.printf("%d  %d  %d", a, b, n);


            System.out.println();
        }
        in.close();
    }


}
