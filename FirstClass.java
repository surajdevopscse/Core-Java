import java.util.*;

public class FirstClass {
    public static void main(String arg[]) {
        System.out.println("First Class Sum Program is");
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter First Digit");
        int fDigit = sc.nextInt();
        System.out.println("Enter Second Digit");
        int sDigit = sc.nextInt();
        int sum = fDigit+ sDigit;
        System.out.println("The Sum of two Number is "+sum);
        sc.close();
        
    }
}
