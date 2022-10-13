import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Table :");
        int n = sc.nextInt();
        for(int i = 1; i<11;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
