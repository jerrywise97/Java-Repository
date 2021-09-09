package chapterTwo;

import java.util.Scanner;
public class TwoPointOneSix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one : ");
        int number1 = input.nextInt();
        System.out.println("Enter number two : ");
        int number2 = input.nextInt();

        if (number1 > number2){
            System.out.printf("%d is larger %n", number1);
        }
        if (number2 > number1){
            System.out.printf("%d is larger %n", number2);
        }
        if (number1 == number2){
            System.out.println("these numbers are equal");
        }


    }
}
