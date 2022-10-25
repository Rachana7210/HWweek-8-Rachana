package HomeWork;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 0;
        int prime = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();

        if(num%2==0 && num>=2){
            prime=0;
        }else {
            prime=1;
        }
        if(prime==0){
            System.out.println("Prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}
