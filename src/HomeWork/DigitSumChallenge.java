package HomeWork;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125is: "+sumDigits(125));
        System.out.println("The sum of the digits in number -125is: "+sumDigits(-125));
        System.out.println("The sum of the digits in number 4is: "+sumDigits(4));
        System.out.println("The sum of the digits in number 32123is: "+sumDigits(32123));
    }

    public static int sumDigits(int number) {
       if(number<10){
           return -1;
       }

       int sum=0;

       while (number>0){
           int digit = number%10;
           sum+=digit;
           number/=10;
       }
        return sum;

    }
}
