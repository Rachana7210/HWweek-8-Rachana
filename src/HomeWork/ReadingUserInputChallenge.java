package HomeWork;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter<=10){
            System.out.println("Enter number#"+counter+":");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int inputNumber= sc.nextInt();
                sum+=inputNumber;
                counter++;
            }else {
                System.out.println("Invalid number");
            }
            sc.nextLine();
        }
            sc.close();
            System.out.println("sum of the number is:"+sum);
    }
}
