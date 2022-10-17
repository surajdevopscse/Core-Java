import java.util.Scanner;

public class OddNumberN {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = oddNumber(n);
        System.out.println(res);
        sc.close();
    }

    public static int oddNumber(int n) {
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;

    }
}
