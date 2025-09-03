package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int n1 = in.nextInt();

        System.out.println("Enter a second integer.");
        int n2 = in.nextInt();

        double n3 = (n1 + n2)/2.0;

        System.out.println("The average is " + n3);


        }
}
