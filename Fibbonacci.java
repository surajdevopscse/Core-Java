import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number for Fibbonacci Series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibbonacciSeries(n);
        sc.close();

    }

    public static void fibbonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
