import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please Enter Number for Factorial");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        factorialNum(n);
    }

    public static void factorialNum(int n) {
        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac = fac * i;
        }
        System.out.println("Factorial of Number is " + fac);
    }
}
