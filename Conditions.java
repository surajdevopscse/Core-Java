import java.lang.*;
import java.util.Scanner;
public class Conditions {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("Number is Even "+num);
        // }else{
        //     System.out.println("Number is Odd "+num);
        // }
        switch(num){
            case 1:System.out.println("Number Hello");
            break;
            case 2: System.out.println("Hi Friends");
            break;
            case 3: System.out.println("Hello France");
            break;
            default: System.out.println("Invalid Pressed");
            break;
        }
        
    }
}
