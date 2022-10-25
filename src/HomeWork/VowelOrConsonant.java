package HomeWork;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet");
        char input = sc.next().charAt(0);

        if(input>='a' && input<='z' || input>='A'&& input<='Z'){
            if(input=='a'|| input=='e'|| input=='i' || input=='o'|| input=='u'){
                System.out.println("Input letter is Vowel");
            }else {
                System.out.println("Input letter is Consonant");
            }
        }else {
            System.out.println("Error");
        }

    }
}
