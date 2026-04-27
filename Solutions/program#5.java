import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String alph = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("Enter any alphabate : ");
        char a = s.nextLine().charAt(0);
        boolean b = alph.contain(a);
        
    }
}
