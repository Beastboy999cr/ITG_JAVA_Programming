// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();
        if (a>0 && a<=7) {
            if (a==2){
                System.out.print("28 ");
                System.out.println("February");
            }
            else if (a%2!=0){
                 System.out.println("31 ");
                 switch(a){
                     case 1:
                         System.out.println("January");
                         break;
                     case 3:
                         System.out.println("March");
                         break;
                     case 5:
                         System.out.println("May");
                         break;
                     case 7:
                         System.out.println("July");
                         break;
                 }
            }
            else {
                 System.out.println("30");
                 switch(a){
                     case 4:
                         System.out.println("April");
                         break;
                     case 6:
                         System.out.println("June");
                         break;
                 }
            }
        }
        else if (a>=8 && a<=12) {
            if (a%2!=0){
               System.out.println("30"); 
               switch(a){
                   case 9:
                       System.out.println("September");
                       break;
                   case 11:
                       System.out.println("November");
                       break;
               }
            }
            else {
                 System.out.println("31");
                 switch(a){
                    case 8:
                       System.out.println("August");
                       break;
                    case 10:
                       System.out.println("October");
                       break;
                    case 12:
                        System.out.println("December");
                        break;
                    
                         
                 }
            }
        }
          
        
    }
}
