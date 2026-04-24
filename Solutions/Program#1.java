// 1. Write a java program to find whether a year is leap or not.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int y = s.nextInt();
        if (y%4==0){
            System.out.println("This is a leap year ");
        }
        else {
            System.out.println("This is not a leap year ");
        }
    }
}
