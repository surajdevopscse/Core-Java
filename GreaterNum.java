import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        System.out.println("Enter Two Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = greaterTwoNum(a, b);
        System.out.println("Greater Num : " + num);
        sc.close();
    }

    public static int greaterTwoNum(int a, int b) {

        if (a > b) {
            return a;
        }
        return b;

    }
}
