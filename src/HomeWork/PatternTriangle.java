package HomeWork;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        System.out.print("Input number of rows");
        Scanner sc =new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();
    }
}
