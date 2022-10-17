import java.util.Scanner;

public class Avearge {
    public static void main(String[] args) {
        System.out.println("Enter 3 Numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = aveargeNum(a, b, c);
        System.out.println(num);
        sc.close();
    }

    public static int aveargeNum(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
