import java.util.Scanner;

public class Revenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        int temp = a; 
        int rev = 0; 
        int rem; 
       
        while (a != 0) {
            rem = a % 10; 
            rev = rev * 10 + rem; 
            a = a / 10; 
        }        
        if (rev == temp) {
            System.out.println("The reversed number is " + rev + ". It is the same as the original.");
        } else {
            System.out.println("The reversed number is " + rev + ". It is not the same as the original.");
        }

        sc.close();
    }
}