// 2. Write a java program to take input 1 to 7 from user and display the day at the certain number .
import java.util.Scanner;
public class day{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your no : ");
        int a = s.nextInt();
        switch(a){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter a correct number !!!!");
                break;
            
        }
    }
}
