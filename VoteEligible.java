import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        System.out.println("Enter the age for Vote :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibleVote(age);
        sc.close();

    }

    public static void eligibleVote(int age) {
        if (age >= 18) {
            System.out.println("Eligible for Vote");
        } else {
            System.out.println("Please take a Milk you are not eligible for vote");
        }
    }
}
