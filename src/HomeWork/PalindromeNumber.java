package HomeWork;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        if (number < 0) {
            num = number * -1;
        }
        while(num>0){
            lastDigit = num%10;
            reverse = reverse *10+lastDigit;
            num/=10;
        }
        return number==reverse;

    }
}