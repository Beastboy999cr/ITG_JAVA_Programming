// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the first no : ");
        double a = s.nextDouble();
        System.out.println("Enter the second no : ");
        double b = s.nextDouble();
        if (((int)a) > ((int)b) ){
            System.out.println("First no is greater");
        } else {
            System.out.println("Second no is greater");
        }
    }
}
