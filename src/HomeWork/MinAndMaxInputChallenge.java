package HomeWork;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        boolean first = true;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter number");
            boolean hasNextInt = sc.hasNextInt();

            if (hasNextInt) {
                int input = sc.nextInt();

                if (first) {
                    min = input;
                    max = input;
                    first = false;
                }

                if(input<min){
                    min = input;
                }

                if(input>max){
                    max = input;
                }

            }else{
                break;
            }
            sc.nextLine();
        }
        System.out.println("Minimum = "+min);
        System.out.println("Maximum = "+max);
        sc.close();

    }
}
