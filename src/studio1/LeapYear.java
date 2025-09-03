package studio1;

import java.util.Scanner;

public class LeapYear {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year whose leap year status you would like to check.");
        int leapYear = in.nextInt();
        boolean tf = (leapYear%4 == 0) && (leapYear%100 != 0) || (leapYear%400 == 0);
        System.out.println(tf);


}
}