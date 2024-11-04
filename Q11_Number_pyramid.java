//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;

public class Q11_Number_pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j< n -i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}
