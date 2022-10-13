import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Enter a number of row for Pattern :");
        row =  sc.nextInt();
        System.out.print("Enter a number of Col for Pattern :");
        col  = sc.nextInt();


       /*   *******
            *******
            *******
            *******    
        for(int i = 1; i<= row; i++){
            for(int j = 0; j<= col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */



        /*  Hollo Patterns 
                *****
                *   *
                *   *
                *   *
                *****
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<= col; j++){
                if(i == 1|| j == 1 || i == row || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        */

        /* Half Pyramid
        *
        **
        ***
        ****

        for(int i = 1; i<= row; i++){
            for (int j =1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

         

    }
}
