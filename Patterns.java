import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Enter a number of row for Pattern :");
        row = sc.nextInt();
        System.out.print("Enter a number of Col for Pattern :");
        col = sc.nextInt();

        /*
         * *******
         *******
         *******
         ******* 
         * for(int i = 1; i<= row; i++){
         * for(int j = 0; j<= col; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * Hollo Patterns
         *****
         * *
         * *
         * *
         *****
         * for(int i = 1; i<= row; i++){
         * for(int j = 1; j<= col; j++){
         * if(i == 1|| j == 1 || i == row || j == col){
         * System.out.print("*");
         * }else{
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         * 
         */

        /*
         * Half Pyramid
         *
         **
         ***
         ****
         * 
         * for(int i = 1; i<= row; i++){
         * for (int j =1; j<= i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         *****
         ****
         ***
         **
         * 
         * 
         * for( int i = row; i>=1; i--){
         * for(int j = 1 ; j<= i; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         *
         **
         ***
         ****
         * 
         * 
         * for(int i = 1; i<= row; i++){
         * for(int j = 1; j<= row-i;j++){
         * System.out.print(" ");
         * }
         * for(int k= 1; k<=i; k++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 
         * for(int i =1 ; i<=row;i++){
         * for(int j =1; j<=i;j++){
         * System.out.print(j+" ");
         * }
         * System.out.println();
         * }
         * 
         */

        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         * 
         * 
         * for(int i = row; i>=1;i--){
         * for(int j = 1; j<=i;j++){
         * System.out.print(j+" ");
         * }
         * System.out.println();
         * }
         * 
         */

        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * 
         * 
         * int num = 1;
         * for(int i = 1; i<=row; i++){
         * for(int j = 1; j<=i;j++){
         * System.out.print(num+" ");
         * num++;
         * }
         * System.out.println();
         * }
         * 
         */

        /*
         * 
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         * 
         * 
         * for(int i = 1; i<= row;i++){
         * for(int j = 1; j<= i; j++){
         * int sum = i+j;
         * if(sum % 2 == 0){
         * System.out.print("1 ");
         * }else{
         * System.out.print("0 ");
         * }
         * }
         * System.out.println();
         * }
         */

    }

}
